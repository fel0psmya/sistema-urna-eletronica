/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Banco;
import model.Cargo;
/**
 *
 * @author felip
 */
public class ContCargo {
    public ContCargo(String nome_cargo) {
        Cargo c = new Cargo (nome_cargo);
        Banco b = new Banco();
        b.Cadastrar(c);
    }
}
