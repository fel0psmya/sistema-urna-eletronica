/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.swing.JOptionPane;
import model.Banco;
import model.Candidato;
/**
 *
 * @author felip
 */
public class ContCand {
    public String respostaTxt;
    
    public ContCand (String nome, String partido, String numero,
    String img, String cargo) {
        if (!nome.equals("") && !partido.equals("") && !numero.equals("") && !img.equals("") && !cargo.equals("")) {
            char[] c = numero.toCharArray();
            boolean vNum = true;
            
            for (int i = 0; i < c.length; i++) {
                if (!Character.isDigit(c[i])) {
                    vNum = false;
                }
            }
            
            if (vNum) {
                Candidato candidato = new Candidato(nome, partido, numero, img, cargo);
                Banco b = new Banco();
                b.Cadastrar(candidato);
            } else {
                JOptionPane.showMessageDialog(null, "Digite um número válido", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não é o homem invisível", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    } /* Recebe os valores da view e envia para o model através da instância de
    Candidato */
    
 
}
