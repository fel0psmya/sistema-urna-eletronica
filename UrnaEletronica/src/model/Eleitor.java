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
public class Eleitor {
    public static String nome, cpf, data_nasc;
    public Eleitor (String nome, String cpf, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data;
    }
}
