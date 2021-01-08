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
            + Candidato.partido +"','"+ Candidato.numero +"','"+ Candidato.img +"')");
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
