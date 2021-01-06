/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author felip
 */
public class Candidato {
    public int id;
    public String nome, partido, numero, img, cargo;
            
    public Candidato (int id, String nome, String partido, String numero,
    String img, String cargo) {
        this.id = id;
        this.nome = nome;
        this.partido = partido;
        this.numero = numero;
        this.img = img;
        this.cargo = cargo; // Fazer comparação com o banco
    } // Recebe os valores do controlador
}
