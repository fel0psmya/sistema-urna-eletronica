/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author felip
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        menu = new javax.swing.JMenuBar();
        menuV = new javax.swing.JMenu();
        itemNV = new javax.swing.JMenuItem();
        menuC = new javax.swing.JMenu();
        itemCand = new javax.swing.JMenuItem();
        itemCarg = new javax.swing.JMenuItem();
        menuE = new javax.swing.JMenu();
        itemE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuV.setText("Novo");

        itemNV.setText("Nova votação");
        itemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNVActionPerformed(evt);
            }
        });
        menuV.add(itemNV);

        menu.add(menuV);

        menuC.setText("Candidato");

        itemCand.setText("Novo candidato");
        itemCand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCandActionPerformed(evt);
            }
        });
        menuC.add(itemCand);

        itemCarg.setText("Novo cargo");
        menuC.add(itemCarg);

        menu.add(menuC);

        menuE.setText("Eleitor");

        itemE.setText("Novo eleitor");
        itemE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEActionPerformed(evt);
            }
        });
        menuE.add(itemE);

        menu.add(menuE);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCandActionPerformed

    private void itemEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEActionPerformed

    private void itemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNVActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCand;
    private javax.swing.JMenuItem itemCarg;
    private javax.swing.JMenuItem itemE;
    private javax.swing.JMenuItem itemNV;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuC;
    private javax.swing.JMenu menuE;
    private javax.swing.JMenu menuV;
    // End of variables declaration//GEN-END:variables
}
