/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.time.LocalDate;

/**
 *
 * @author felip
 */
public class TelaVotacao extends javax.swing.JFrame {
    /** 
     * Creates new form TelaVotacao
     */
    public TelaVotacao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCima = new javax.swing.JPanel();
        pnBaixo = new javax.swing.JPanel();
        pnConteudo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMV = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCad = new javax.swing.JButton();
        txtCargo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Votação");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnCima.setBackground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout pnCimaLayout = new javax.swing.GroupLayout(pnCima);
        pnCima.setLayout(pnCimaLayout);
        pnCimaLayout.setHorizontalGroup(
            pnCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnCimaLayout.setVerticalGroup(
            pnCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(pnCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 400, -1));

        pnBaixo.setBackground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout pnBaixoLayout = new javax.swing.GroupLayout(pnBaixo);
        pnBaixo.setLayout(pnBaixoLayout);
        pnBaixoLayout.setHorizontalGroup(
            pnBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnBaixoLayout.setVerticalGroup(
            pnBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(pnBaixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pnConteudo.setBackground(new java.awt.Color(255, 255, 255));
        pnConteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("Cargo");
        pnConteudo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("Data");
        pnConteudo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setToolTipText("Ano / Mês / Dia");
        txtData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        pnConteudo.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, -1));

        txtMV.setColumns(20);
        txtMV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMV.setRows(5);
        jScrollPane1.setViewportView(txtMV);

        pnConteudo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 260, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("Motivação");
        pnConteudo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("da Votação");
        pnConteudo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        btnCad.setBackground(new java.awt.Color(153, 0, 51));
        btnCad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCad.setForeground(new java.awt.Color(255, 255, 255));
        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });
        pnConteudo.add(btnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 30));

        txtCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        pnConteudo.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 260, 30));

        getContentPane().add(pnConteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        LocalDate a = java.time.LocalDate.now(); 
        txtMV.setText(String.valueOf(a.getDayOfYear()) + String.valueOf(a.getYear()) + String.valueOf(a.getMonthValue()));
    }//GEN-LAST:event_btnCadActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVotacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnBaixo;
    private javax.swing.JPanel pnCima;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextArea txtMV;
    // End of variables declaration//GEN-END:variables
}
