/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Votacao;

/**
 *
 * @author felip
 */
public class ContVota {
    public ContVota (String data, String motivacao, String cargo){
        Votacao v = new Votacao(data, motivacao, cargo);
    }
}
