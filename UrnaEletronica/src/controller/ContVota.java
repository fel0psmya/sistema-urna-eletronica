/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Banco;

/**
 *
 * @author felip
 */
public class ContVota {
    public ContVota (String data, String motivacao, String cargo){
        if (!data.equals("") && !motivacao.equals("") && !cargo.equals("")) {
            LocalDate a = java.time.LocalDate.now();
            String[] dot = data.split("-");
            if (((a.getYear() >= Integer.parseInt(dot[0]) && a.getMonthValue() >= Integer.parseInt(dot[1])) && a.getDayOfMonth() >= Integer.parseInt(dot[2])) || 
                 (a.getYear() > Integer.parseInt(dot[0]) && Integer.parseInt(dot[1]) <= 12 && Integer.parseInt(dot[2]) <= 31)){
                Banco b = new Banco ();
                b.pegarDados(data, motivacao, cargo);
            } else {
                JOptionPane.showMessageDialog(null, "Você veio do futuro?", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Há campos vazios", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
