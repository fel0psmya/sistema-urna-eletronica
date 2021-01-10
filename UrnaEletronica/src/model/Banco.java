/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import views.TelaUrna;
import static views.TelaUrna.lblNome;
import static views.TelaUrna.lblPartido;
/**
 *
 * @author felip
 */
public class Banco {
    String BANCO = "urnadb";
    String SERVER = "jdbc:mysql://localhost:3306/";
    String USER = "root";
    String SENHA = ""; 
    
    Connection conn = null; //objeto conexão 
    Statement stmt; // executa instruções no banco
    ResultSet rs; // resultado de uma query
 
    public Banco () {
        // ...
    }
    
    public Banco (String banco, String server, String user, String senha) {
        this.BANCO = banco;
        this.USER = user;
        this.SENHA = senha;
        this.SERVER = server;
    } // Acessar um banco diferente
    
    /* ================== CANDIDATO ================== */
    public boolean Cadastrar (Candidato candidato) {
        try {
            conectar();
            stmt = conn.createStatement();            
            stmt.executeUpdate("INSERT into candidato values (default, '"+ Candidato.nome +"','"
            + Candidato.partido +"','"+ Candidato.numero +"','"+ Candidato.img.replace("\\", "-") +"', '"
            + Candidato.cargo +"')");
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! :D", "Show!", JOptionPane.INFORMATION_MESSAGE);
            desconectar();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao cadastrar", JOptionPane.ERROR_MESSAGE);
            desconectar();
            return false;
        }
    }
    
    /* ================== ELEITOR ================== */
    public boolean Cadastrar (Eleitor eleitor) {
         try {
            conectar();
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT into eleitor values (default, '"+ Eleitor.nome +"','"
            + Eleitor.cpf +"','"+ Eleitor.data_nasc +"')");
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! :D", "Show!", JOptionPane.INFORMATION_MESSAGE);
            desconectar();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao cadastrar", JOptionPane.ERROR_MESSAGE);
            desconectar();
            return false;
        }
    }
    
    /* ================== MÉTODOS DE CONEXÃO E FECHAMENTO DE CONEXÃO ================== */
    public Connection conectar () {
        try {
            conn = DriverManager.getConnection(SERVER + BANCO, USER, SENHA);
            // Conectado
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha na conexão", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
    
    public void desconectar () {
        try {
            if (stmt != null){
                stmt.close();
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha na desconexão", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /* ================== MÉTODOS DA URNA/VOTAÇÃO ================== */
    public String data, motivacao, cargo;
    public void pegarDados (String data, String motivacao, String cargo) {
        this.data = data;
        this.motivacao = motivacao;
        this.cargo = cargo;
        
        new TelaUrna().show();
        TelaUrna.lblCargo.setText(cargo);
        TelaUrna.lblData.setText(data);
        TelaUrna.lblMV.setText(motivacao);
    }
    
    public int numE = 1;
    
    public void proximoEleitor () {
        TelaUrna.lblFim.setVisible(false);
        TelaUrna.pnInfo.setVisible(true);
        TelaUrna.pnImg.setVisible(true);
        TelaUrna.lblCargo.setVisible(true);
        TelaUrna.lblNum1.setVisible(true);
        TelaUrna.lblNum2.setVisible(true);
        lblNome.setVisible(true);
        lblPartido.setVisible(true);
        TelaUrna.lblVotoPara.setVisible(true);
        TelaUrna.lblTituloNum.setVisible(true);
        TelaUrna.lblTituloNome.setVisible(true);
        TelaUrna.lblTituloPartido.setVisible(true);
        
        TelaUrna.lblId.setText("" + (Integer.parseInt(TelaUrna.lblId.getText())+1));
        TelaUrna.lblNum1.setText("");
        TelaUrna.lblNum2.setText("");
        TelaUrna.lblNome.setText("");
        TelaUrna.lblPartido.setText("");
        TelaUrna.lblIcone.setIcon(null);
        TelaUrna.lblIdCand.setText("");
    }
    
    public ResultSet mostrarCandidato () {
        try {
            String numeroCand = TelaUrna.lblNum1.getText() + TelaUrna.lblNum2.getText();
            int num = Integer.parseInt(numeroCand);
            conectar();
            stmt = conn.createStatement();
            //rs = stmt.executeQuery("SELECT * FROM candidato WHERE numero =  "+ num +" and cargo like '"+ TelaUrna.lblCargo.toString() +"'"); // resultSet RESOLVER ESSA PORRA            
            rs = stmt.executeQuery("SELECT * FROM candidato WHERE numero =  "+ num +" and cargo like '"+ TelaUrna.lblCargo.getText() +"'");
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("numero")) == num && rs.getString("cargo").equals(TelaUrna.lblCargo.getText())) {
                    TelaUrna.lblNome.setText(rs.getString("nome"));
                    TelaUrna.lblPartido.setText(rs.getString("partido"));
                    TelaUrna.lblIdCand.setText(rs.getString("id"));
                    String imgDsn = rs.getString("img").replaceAll("-", "\\\\");
                    ImageIcon img = new ImageIcon(imgDsn);
                    TelaUrna.lblIcone.setIcon(new ImageIcon(img.getImage().getScaledInstance(TelaUrna.lblIcone.getWidth(), TelaUrna.lblIcone.getHeight(), Image.SCALE_DEFAULT)));
                } else {
                    TelaUrna.lblNome.setText(rs.getString("nome"));
                    TelaUrna.lblPartido.setText(rs.getString("partido"));
                    TelaUrna.lblIdCand.setText(rs.getString("id"));
                    if (TelaUrna.lblNome.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há números de candidatos e/ou cargos correspondentes aos inseridos", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }   
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao consultar candidato", JOptionPane.ERROR_MESSAGE);
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {};
            try { if (stmt != null) stmt.close(); } catch (Exception e) {};
            try { if (conn != null) conn.close(); } catch (Exception e) {};
        }
        return null;
    }
    
    public boolean verificarUltimo() { // ok
        try{
            rs = stmt.executeQuery("SELECT count(id) as total from eleitor");
            while (rs.next()) {
                int totalE = Integer.parseInt(rs.getString("total"));
                return Integer.parseInt(TelaUrna.lblId.getText()) == totalE;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao verificar eleitores", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {};
            try { if (stmt != null) stmt.close(); } catch (Exception e) {};
            try { if (conn != null) conn.close(); } catch (Exception e) {};
        }
        return false;
    }
    
    public void getNumCand() {
        try {
            conectar();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT count(*) as total FROM candidato WHERE cargo like '"+ TelaUrna.lblCargo.getText() +"'");
            while (rs.next()) {
                TelaUrna.lblNumCand.setText("" + rs.getInt("total"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao verificar número de candidatos", JOptionPane.ERROR_MESSAGE);
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {};
            try { if (stmt != null) stmt.close(); } catch (Exception e) {};
            try { if (conn != null) conn.close(); } catch (Exception e) {};
        }
    }
    
    public void confirmarVoto () {
        conectar();
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT into votacao values (default, "+ Integer.parseInt(TelaUrna.lblId.getText()) +","
            + Integer.parseInt(TelaUrna.lblIdCand.getText()) +",'"+ TelaUrna.lblCargo.getText() +"','"+ TelaUrna.lblMV.getText() 
            +"','"+ TelaUrna.lblData.getText() +"')");
            JOptionPane.showMessageDialog(null, "Voto confirmado! :D", "Show!", JOptionPane.INFORMATION_MESSAGE);
            if (!verificarUltimo()) { // ERRO
                proximoEleitor();
            } else {
                conectar();                
                try {
                    JOptionPane.showMessageDialog(null, "Votação encerrada", "Show!", JOptionPane.INFORMATION_MESSAGE);
                    List<String> candidatos = new ArrayList();
                    List<String> votos_cand = new ArrayList();
                    
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery("SELECT c.nome, c.id, v.id_candidato, count(c.id) as total_cand, count(v.id_voto) as total_vot, v.motivo_votacao, v.data_votacao FROM candidato c, votacao v "
                        + "WHERE c.id = v.id_candidato and v.data_votacao like '"+ TelaUrna.lblData.getText() +"' and v.motivo_votacao like '"+ TelaUrna.lblMV.getText() +"' GROUP BY c.id ORDER BY total_vot desc");
                
                    
                    if (rs.next()) {
                        do {
                            candidatos.add(rs.getString("c.nome"));
                            votos_cand.add(rs.getString("total_vot"));
                        } while (rs.next());
                    }
                    
                    int total = 0;
                    rs = stmt.executeQuery("SELECT count(c.id) as total FROM votacao v, candidato c WHERE c.id = v.id_candidato and c.cargo like '"+ TelaUrna.lblCargo.getText() +"' and v.data_votacao like '"+ TelaUrna.lblData.getText() +"' and v.motivo_votacao like '"+ TelaUrna.lblMV.getText() +"'");
                    if (rs.next()) {
                        total = rs.getInt("total");
                    }
                    
                    System.out.println(candidatos.get(0) + " " + total);
                    for (int i = 0; i < total; i++) { // ERRO
                        String resultado = "<html>"+(i+1)+"º lugar: "+candidatos.get(i)+" com "+votos_cand.get(i)+"votos <br></html>";
                        if (i == (total-1)) {
                            JOptionPane.showMessageDialog(null, "" + resultado);
                            break;
                        }
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao verificar o resultado da votação", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao confirmar voto", JOptionPane.ERROR_MESSAGE);
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {};
            try { if (stmt != null) stmt.close(); } catch (Exception e) {};
            try { if (conn != null) conn.close(); } catch (Exception e) {};
        }
    }
    
}
