/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author anyariz02
 */
public class KonversiSuhu extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhu
     */
    public KonversiSuhu() {
        initComponents();
        this.setTitle("Aplikasi Konversi Suhu"); // that is the code you looking for
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        fahrenheitLabel = new javax.swing.JLabel();
        convertButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        celciusLabel = new javax.swing.JLabel();
        celciusTextField = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fahrenheitLabel.setText("Fahrenheit");

        convertButton.setText("CONVERT");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clearButton1.setText("CLEAR");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        celciusLabel.setText("Celcius");

        celciusTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celciusTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(celciusTextField)
                            .addComponent(convertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celciusLabel)
                            .addComponent(fahrenheitLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celciusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celciusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fahrenheitLabel)
                    .addComponent(convertButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton1)
                    .addComponent(jButton1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        double celcius = Double.parseDouble(celciusTextField.getText());
        double fahrenheit = 1.8 * celcius +32;
        fahrenheitLabel.setText(Double.toString(fahrenheit)+" Fahrenheit");
        
    }//GEN-LAST:event_convertButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        celciusTextField.setText("");
        fahrenheitLabel.setText("Fahrenheit");
        celciusTextField.requestFocus();
    }//GEN-LAST:event_clearButton1ActionPerformed

    private void celciusTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celciusTextFieldKeyTyped
        char c = evt.getKeyChar();
        if( ! ((Character.isDigit(c) ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))
        )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Masukkan hanya 0-9");
            evt.consume();

        }
    }//GEN-LAST:event_celciusTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celciusLabel;
    private javax.swing.JTextField celciusTextField;
    private javax.swing.JButton clearButton1;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel fahrenheitLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
