/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacegrafica;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class ExercicioRadioButton extends javax.swing.JFrame {

    /**
     * Creates new form ExercicioRadioButton
     */
    public ExercicioRadioButton() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        internacional = new javax.swing.JRadioButton();
        gremio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        resposta = new javax.swing.JLabel();
        juventude = new javax.swing.JRadioButton();
        none_of_them = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(internacional);
        internacional.setForeground(new java.awt.Color(255, 255, 255));
        internacional.setText("internacional");
        internacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internacionalActionPerformed(evt);
            }
        });

        buttonGroup1.add(gremio);
        gremio.setText("gremio");
        gremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gremioActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("qual time vc torce?");

        resposta.setForeground(new java.awt.Color(255, 255, 255));
        resposta.setText("resposta:");

        buttonGroup1.add(juventude);
        juventude.setForeground(new java.awt.Color(255, 255, 255));
        juventude.setText("juventude");
        juventude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juventudeActionPerformed(evt);
            }
        });

        buttonGroup1.add(none_of_them);
        none_of_them.setForeground(new java.awt.Color(255, 255, 255));
        none_of_them.setText("none of them");
        none_of_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none_of_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gremio)
                            .addComponent(juventude))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(none_of_them)
                            .addComponent(internacional)))
                    .addComponent(resposta))
                .addContainerGap(780, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gremio)
                    .addComponent(internacional))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(juventude)
                    .addComponent(none_of_them))
                .addGap(50, 50, 50)
                .addComponent(resposta)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gremioActionPerformed
        if(gremio.isSelected()){
            resposta.setText("vc escolheu um otimo time :)");
        }
    }//GEN-LAST:event_gremioActionPerformed

    private void internacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internacionalActionPerformed
        if(internacional.isSelected()){
            resposta.setText("não e ruim -_-");
        }
    }//GEN-LAST:event_internacionalActionPerformed

    private void juventudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juventudeActionPerformed
      if(juventude.isSelected()){
          resposta.setText("vc tem problema cara T_T");
      }
    }//GEN-LAST:event_juventudeActionPerformed

    private void none_of_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none_of_themActionPerformed
      if(none_of_them.isSelected()){
          resposta.setText("não vai chorar pelo menos -_-");
      }
    }//GEN-LAST:event_none_of_themActionPerformed

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
            java.util.logging.Logger.getLogger(ExercicioRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExercicioRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExercicioRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExercicioRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExercicioRadioButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton gremio;
    private javax.swing.JRadioButton internacional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton juventude;
    private javax.swing.JRadioButton none_of_them;
    private javax.swing.JLabel resposta;
    // End of variables declaration//GEN-END:variables
}
