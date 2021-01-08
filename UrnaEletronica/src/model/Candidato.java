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
    public static String nome, partido, numero, img;
            
    public Candidato (String nome, String partido, String numero,
    String img) {
        this.nome = nome;
        this.partido = partido;
        this.numero = numero;
        this.img = img;
    } // Recebe os valores do controlador
}
