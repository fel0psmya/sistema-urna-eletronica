/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Banco;
import model.Candidato;
/**
 *
 * @author felip
 */
public class ContCand {
    public String respostaTxt;
    
    public ContCand (String nome, String partido, String numero,
    String img) {
        Candidato candidato = new Candidato(nome, partido, numero, img);
        Banco b = new Banco();
        b.Cadastrar(candidato);
    } /* Recebe os valores da view e envia para o model através da instância de
    Candidato */
 
}
