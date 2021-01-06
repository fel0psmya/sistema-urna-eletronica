/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.*;
import controller.*;
/**
 *
 * @author felip
 */
public class Banco {
    String BANCO = "urnadb";
    String SERVER = "jdbc:mysql://localhost:/";
    String USER = "root";
    String SENHA = ""; 
    
    public Banco () {
        // ...
    }
    
    public Banco (String banco, String server, String user, String senha) {
        this.BANCO = banco;
        this.USER = user;
        this.SENHA = senha;
        this.SERVER = server;
    } // Acessar um banco diferente
    
    
    public boolean Cadastrar (Candidato candidato) {
        return true;
    }
    
    public boolean Cadastrar (Cargo cargo) {
        return true;
    }
    
    public boolean Cadastrar (Eleitor eleitor) {
        return true;
    }
    
    public boolean Cadastrar (Votacao candidato) {
        return true;
    }
    
    
    public Connection conectar () {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(SERVER + BANCO, USER, SENHA);
            // Conectado
        } catch (SQLException e) {
            
        }
        
        return conn;
    }
}
