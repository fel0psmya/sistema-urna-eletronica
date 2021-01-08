/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import static java.lang.Float.parseFloat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Banco;
import model.Eleitor;

/**
 *
 * @author felip
 */
public class ContEleitor {
    public ContEleitor (String nome, String cpf, String data_nasc) {
        LocalDate a = java.time.LocalDate.now(); 
        String[] data = data_nasc.split("-");
        float idadeA = a.getYear() + a.getMonthValue()/12 + a.getDayOfYear()/365;
        float idadeB = Integer.parseInt(data[0]) + parseFloat(data[1])/12 +
            (parseFloat(data[2]) + parseFloat(data[1]) * 30) /365;
        float idadeEleitor = (idadeA - idadeB);
        if (idadeEleitor < 16) {
            JOptionPane.showMessageDialog(null, "Você não pode votar, sua idade é " + idadeEleitor + " anos", "Atenção!", JOptionPane.ERROR_MESSAGE);
        } else if (idadeEleitor >= 16 && idadeEleitor < 18
                    || idadeEleitor >= 60) {
            JOptionPane.showMessageDialog(null, "<html>Ficamos felizes em ver que mesmo <br>"
                    + "não sendo obrigatório você votar, você <br> quer exercer seu papel de cidadão :') <br> sua idade é " + idadeEleitor + " anos");
            Eleitor e = new Eleitor (nome, cpf, data_nasc); 
            Banco b = new Banco ();
            b.Cadastrar(e);
        } else {
            JOptionPane.showMessageDialog(null, "Você pode votar! ^^ sua idade é " + idadeEleitor + " anos");
            Eleitor e = new Eleitor (nome, cpf, data_nasc); 
            Banco b = new Banco ();
            b.Cadastrar(e);
        }
    }
       
}
