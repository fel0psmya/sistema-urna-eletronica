/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
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
    ResultSet rs = null; // resultado de uma query
 
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
            + Candidato.partido +"','"+ Candidato.numero +"','"+ Candidato.img +"','"+ Candidato.cargo +"')");
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! :D", "Show!", JOptionPane.INFORMATION_MESSAGE);
            desconectar();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao cadastrar", JOptionPane.ERROR_MESSAGE);
            desconectar();
            return false;
        }
        
    }
    
    public String modeloCombo;
    
    public void setModel (String model) {
        this.modeloCombo = model;
    }
    
    public void comboBoxCargo () {
        try {
            conectar();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT count(*) as total FROM cargo");
            int k = rs.getInt("total");
            rs.close(); stmt.close();
            JOptionPane.showMessageDialog(null, "show");
            // criando o model
            stmt = conn.createStatement();
            
            String model;
            for (int i = 1; i <= k; i++) {
                model = "" + stmt.executeQuery("SELECT nome_cargo FROM cargo WHERE id = " + i).getString("nome_cargo") + ",";
                setModel(model);
            }
            desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao cadastrar", JOptionPane.ERROR_MESSAGE);
            desconectar();
            
        }
    }
    /* ================== CARGO ================== */
    public boolean Cadastrar (Cargo cargo) {  
        try {
            conectar();
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT into cargo VALUES (default, '"+ Cargo.cargo +"')");
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! :D", "Show!", JOptionPane.INFORMATION_MESSAGE);
            desconectar();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha ao cadastrar", JOptionPane.ERROR_MESSAGE);
            desconectar();
            return false;
        }
    }
    
    public boolean Cadastrar (Eleitor eleitor) {
        return true;
    }
    
    public boolean Cadastrar (Votacao candidato) {
        return true;
    }
    
    
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
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Falha na desconexão", JOptionPane.ERROR_MESSAGE);
        }
    }
}
