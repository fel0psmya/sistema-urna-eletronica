/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import views.TelaUrna;
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
    Statement stmt = null; // executa instruções no banco
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
    
    /* ================== MÉTODOS DA VOTAÇÃO ================== */
    public String data, motivacao, cargo;
    public void pegarDados (String data, String motivacao, String cargo) {
        this.data = data;
        this.motivacao = motivacao;
        this.cargo = cargo;
        
        new TelaUrna().show();
        TelaUrna.lblCargo.setText(cargo);
    }
    
    public int numE;
    
    public void proximoEleitor () {
        TelaUrna.lblId.setText("" + 1);
        TelaUrna.lblNum1.setText("");
        TelaUrna.lblNum2.setText("");
        TelaUrna.lblNome.setText("");
        TelaUrna.lblPartido.setText("");
        TelaUrna.lblIcone.setText("");
        TelaUrna.lblIdCand.setText("");
    }
    
    public ResultSet mostrarCandidato () {
        try {
            conectar();
            stmt = conn.createStatement();
            String numeroCand = TelaUrna.lblNum1.getText() + TelaUrna.lblNum2.getText();
            int num = Integer.parseInt(numeroCand);
            rs = stmt.executeQuery("SELECT * FROM candidato WHERE numero =  "+ num +" and cargo like '"+ TelaUrna.lblCargo.toString() +"'"); // resultSet RESOLVER ESSA PORRA
        
            // Mostrando os dados do candidato na tela
            TelaUrna.lblNome.setText(rs.getString("nome"));
            TelaUrna.lblPartido.setText(rs.getString("partido"));
            TelaUrna.lblIdCand.setText(rs.getString("id"));
            TelaUrna.lblNome.setText(rs.getString("nome"));
                
            JOptionPane.showMessageDialog(null, "achou", "Show!", JOptionPane.INFORMATION_MESSAGE);
            
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao consultar candidato", JOptionPane.ERROR_MESSAGE);
            desconectar();
        }
        return null;
    }
    
    public void confirmarVoto () {
        try {
            conectar();
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT into votacao values (default, "+ Integer.parseInt(TelaUrna.lblId.getText()) +","
            + Integer.parseInt(TelaUrna.lblIdCand.getText()) +",'"+ cargo +"','"+ motivacao +"','"+ data +"')");
            JOptionPane.showMessageDialog(null, "Voto confirmado! :D", "Show!", JOptionPane.INFORMATION_MESSAGE);
            proximoEleitor();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao cpnfirmar voto", JOptionPane.ERROR_MESSAGE);
            desconectar();
        }
    // MÉTODO DE TERMINAR VOTAÇÃO
    // MÉTODO DE MOSTRAR RESULTADO
    }
}
