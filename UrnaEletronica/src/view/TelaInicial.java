/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;

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

        jPanel1 = new javax.swing.JPanel();
        pV = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pC = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pCargo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pEleitor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuV = new javax.swing.JMenu();
        itemNV = new javax.swing.JMenuItem();
        menuC = new javax.swing.JMenu();
        itemCand = new javax.swing.JMenuItem();
        itemCarg = new javax.swing.JMenuItem();
        menuE = new javax.swing.JMenu();
        itemE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pV.setBackground(new java.awt.Color(0, 0, 0));
        pV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pVMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nova votação");

        javax.swing.GroupLayout pVLayout = new javax.swing.GroupLayout(pV);
        pV.setLayout(pVLayout);
        pVLayout.setHorizontalGroup(
            pVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        pVLayout.setVerticalGroup(
            pVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(pV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 329, -1));

        pC.setBackground(new java.awt.Color(0, 0, 0));
        pC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Novo candidato");

        javax.swing.GroupLayout pCLayout = new javax.swing.GroupLayout(pC);
        pC.setLayout(pCLayout);
        pCLayout.setHorizontalGroup(
            pCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCLayout.setVerticalGroup(
            pCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel1.add(pC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 329, -1));

        pCargo.setBackground(new java.awt.Color(0, 0, 0));
        pCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCargoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCargoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCargoMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Novo cargo");

        javax.swing.GroupLayout pCargoLayout = new javax.swing.GroupLayout(pCargo);
        pCargo.setLayout(pCargoLayout);
        pCargoLayout.setHorizontalGroup(
            pCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCargoLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        pCargoLayout.setVerticalGroup(
            pCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCargoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );

        jPanel1.add(pCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        pEleitor.setBackground(new java.awt.Color(0, 0, 0));
        pEleitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pEleitorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pEleitorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pEleitorMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Novo eleitor");

        javax.swing.GroupLayout pEleitorLayout = new javax.swing.GroupLayout(pEleitor);
        pEleitor.setLayout(pEleitorLayout);
        pEleitorLayout.setHorizontalGroup(
            pEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEleitorLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel4)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        pEleitorLayout.setVerticalGroup(
            pEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEleitorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(pEleitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 329, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setText("Sistema de Votação");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Made by: Felipe Maia");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 420, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 0, 430, 453));

        menuV.setText("Novo");

        itemNV.setText("Nova votação");
        itemNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemNVMouseClicked(evt);
            }
        });
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
        itemCarg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCargActionPerformed(evt);
            }
        });
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCandActionPerformed
        new TelaCandidato().show();
    }//GEN-LAST:event_itemCandActionPerformed

    private void itemEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEActionPerformed
        new TelaEleitor().show();
    }//GEN-LAST:event_itemEActionPerformed

    private void itemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNVActionPerformed
        new TelaVotacao().show();
    }//GEN-LAST:event_itemNVActionPerformed

    private void pVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVMouseEntered
        pV.setBackground(Color.white);
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_pVMouseEntered

    private void pCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCMouseEntered
        pC.setBackground(Color.white);
        jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_pCMouseEntered

    private void pCargoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCargoMouseEntered
        pCargo.setBackground(Color.white);
        jLabel2.setForeground(Color.black);
    }//GEN-LAST:event_pCargoMouseEntered

    private void pEleitorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEleitorMouseEntered
        pEleitor.setBackground(Color.white);
        jLabel4.setForeground(Color.black);
    }//GEN-LAST:event_pEleitorMouseEntered

    private void pVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVMouseExited
        pV.setBackground(Color.black);
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_pVMouseExited

    private void pCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCMouseExited
        pC.setBackground(Color.black);
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_pCMouseExited

    private void pCargoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCargoMouseExited
        pCargo.setBackground(Color.black);
        jLabel2.setForeground(Color.white);
    }//GEN-LAST:event_pCargoMouseExited

    private void pEleitorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEleitorMouseExited
        pEleitor.setBackground(Color.black);
        jLabel4.setForeground(Color.white);
    }//GEN-LAST:event_pEleitorMouseExited

    private void pVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVMouseClicked
        new TelaVotacao().show();
    }//GEN-LAST:event_pVMouseClicked

    private void itemNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemNVMouseClicked
        // NADA
    }//GEN-LAST:event_itemNVMouseClicked

    private void pCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCMouseClicked
        new TelaCandidato().show();
    }//GEN-LAST:event_pCMouseClicked

    private void itemCargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCargActionPerformed
        new TelaCargo().show();
    }//GEN-LAST:event_itemCargActionPerformed

    private void pCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCargoMouseClicked
        new TelaCargo().show();
    }//GEN-LAST:event_pCargoMouseClicked

    private void pEleitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEleitorMouseClicked
        new TelaEleitor().show();
    }//GEN-LAST:event_pEleitorMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuC;
    private javax.swing.JMenu menuE;
    private javax.swing.JMenu menuV;
    private javax.swing.JPanel pC;
    private javax.swing.JPanel pCargo;
    private javax.swing.JPanel pEleitor;
    private javax.swing.JPanel pV;
    // End of variables declaration//GEN-END:variables
}