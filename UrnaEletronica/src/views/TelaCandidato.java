/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Image;
import java.io.File;
import static java.lang.Integer.parseInt;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import controller.ContCand;
import javax.swing.JOptionPane;
import model.Banco;
/**
 *
 * @author felip
 */
public class TelaCandidato extends javax.swing.JFrame {

    /**
     * Creates new form TelaCandidato
     */
    public TelaCandidato() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pnCima = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        pnFoto = new javax.swing.JPanel();
        lblIcone = new javax.swing.JLabel();
        txtImg = new javax.swing.JTextField();
        pnBaixo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPart = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        btnCad = new javax.swing.JButton();
        txtCargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Candidato");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 500));
        setPreferredSize(new java.awt.Dimension(450, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnCima.setBackground(new java.awt.Color(0, 153, 255));
        pnCima.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Imagem do Candidato");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnCima.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 160, -1));

        pnFoto.setBackground(new java.awt.Color(255, 255, 255));
        pnFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnFoto.setForeground(new java.awt.Color(204, 204, 255));
        pnFoto.setPreferredSize(new java.awt.Dimension(100, 125));

        javax.swing.GroupLayout pnFotoLayout = new javax.swing.GroupLayout(pnFoto);
        pnFoto.setLayout(pnFotoLayout);
        pnFotoLayout.setHorizontalGroup(
            pnFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFotoLayout.createSequentialGroup()
                .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnFotoLayout.setVerticalGroup(
            pnFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFotoLayout.createSequentialGroup()
                .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnCima.add(pnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 104, 129));

        txtImg.setEditable(false);
        txtImg.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        txtImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImgActionPerformed(evt);
            }
        });
        pnCima.add(txtImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 160, -1));

        getContentPane().add(pnCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 230));

        pnBaixo.setBackground(new java.awt.Color(255, 255, 255));
        pnBaixo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("Nome");
        pnBaixo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("Partido");
        pnBaixo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setText("Número");
        pnBaixo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.setToolTipText("");
        txtNome.setPreferredSize(null);
        pnBaixo.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 330, -1));

        txtPart.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPart.setToolTipText("");
        txtPart.setPreferredSize(null);
        pnBaixo.add(txtPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 330, -1));

        txtNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNum.setToolTipText("");
        txtNum.setPreferredSize(null);
        pnBaixo.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 55, -1));

        btnCad.setBackground(new java.awt.Color(0, 153, 255));
        btnCad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCad.setForeground(new java.awt.Color(255, 255, 255));
        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });
        pnBaixo.add(btnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, 30));

        txtCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCargo.setToolTipText("");
        txtCargo.setPreferredSize(null);
        pnBaixo.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("<html>Cargo <br> pretendido </html>");
        pnBaixo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 30));

        getContentPane().add(pnBaixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 450, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JFileChooser file = new JFileChooser();
         file.setFileSelectionMode(JFileChooser.FILES_ONLY);
         int i= file.showSaveDialog(null);
       if (i==1){
           txtImg.setText("");
       } else {
           File arquivo = file.getSelectedFile();
           txtImg.setText(arquivo.getPath());
           ImageIcon img;
           img = new ImageIcon(arquivo.getPath());
           lblIcone.setIcon(new ImageIcon(img.getImage().getScaledInstance(lblIcone.getWidth(), lblIcone.getHeight(), Image.SCALE_DEFAULT)));
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImgActionPerformed
        
    }//GEN-LAST:event_txtImgActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
            ContCand c = new ContCand(txtNome.getText(), txtPart.getText(), txtNum.getText(), 
            txtImg.getText(), txtCargo.getText());
            // Envia os valores para o controlador
            
    }//GEN-LAST:event_btnCadActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCandidato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JPanel pnBaixo;
    private javax.swing.JPanel pnCima;
    private javax.swing.JPanel pnFoto;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtImg;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPart;
    // End of variables declaration//GEN-END:variables
}
