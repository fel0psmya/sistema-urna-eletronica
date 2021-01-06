/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Banco;
import model.Candidato;
import model.Cargo;
import model.Eleitor;
import model.Votacao;
/**
 *
 * @author felip
 */
public class ContCand {
    public String respostaTxt;
    
    public ContCand (int id, String nome, String partido, String numero,
    String img, String cargo) {
        Candidato candidato = new Candidato(id, nome, partido, numero, img, 
        cargo);
        Banco b = new Banco();
        boolean resposta = b.Cadastrar(candidato);
        if (resposta == true) {
            respostaTxt = "Cadastrado com sucesso! :D";
        } else {
            respostaTxt = "ERRO:";
        }
    } /* Recebe os valores da view e envia para o model através da instância de
    Candidato */
}
