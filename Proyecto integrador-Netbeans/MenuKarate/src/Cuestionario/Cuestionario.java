/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;
import clases.Preguntas.*;
import clases.Respuestas.*;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import menuk.*;
/**
 *
 * @author wesle
 */
public class Cuestionario extends javax.swing.JFrame {

    int posicion = 0;
     Respuestas r1 = new Respuestas();
    Respuestas r = new Respuestas();
    Preguntas p = new Preguntas();
    String[] select = {"","","","","","","","","",""}; 
    @SuppressWarnings("unchecked")
    public Cuestionario() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
         setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.PNG")).getImage());
        question.setText(p.getPregunta(posicion));
        String[] a = r.setRespuestas(posicion);
        opc1.setText(a[0]);
        opc2.setText(a[1]);
        opc3.setText(a[2]);
        opc4.setText(a[3]);
        opc1.requestFocus();
        Respu.setText(r1.getRespuesta(posicion));
        regresar.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        question = new javax.swing.JLabel();
        opc1 = new javax.swing.JLabel();
        opc2 = new javax.swing.JLabel();
        opc3 = new javax.swing.JLabel();
        opc4 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Respu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuestionario Cinturon Negro"));

        question.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        question.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        question.setText("Pregunta");
        question.setEnabled(false);
        question.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        opc1.setText("opci");

        opc2.setText("opc");

        opc3.setText("opc");

        opc4.setText("opc");

        regresar.setText("<< Regresar");
        regresar.setBorderPainted(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        avanzar.setText("Avanzar >>");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Respuesta: ");

        Respu.setBackground(new java.awt.Color(0, 204, 51));
        Respu.setForeground(new java.awt.Color(0, 51, 51));
        Respu.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Respu, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(regresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avanzar))
                            .addComponent(opc2)
                            .addComponent(opc4)
                            .addComponent(opc1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opc3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(question)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(question)
                .addGap(18, 18, 18)
                .addComponent(opc1)
                .addGap(18, 18, 18)
                .addComponent(opc2)
                .addGap(25, 25, 25)
                .addComponent(opc3)
                .addGap(28, 28, 28)
                .addComponent(opc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Respu))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regresar)
                            .addComponent(avanzar))
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed

        if(posicion==0 ){
            regresar.setEnabled(false);

        }
        if(posicion >0){
            avanzar.setEnabled(true);
            posicion--;
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);

            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            
            Respu.setText(r1.getRespuesta(posicion));
            opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_regresarActionPerformed

    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

        if(posicion == 8 ){
            avanzar.setEnabled(false);

        }

        if(posicion <9){
            regresar.setEnabled(true);
            posicion++;
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            // sirve para borrar las selecciones de los radio button// sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            Respu.setText(r1.getRespuesta(posicion));
            opc1.requestFocus();

        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_avanzarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Interface A=new Interface();
        A.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Respu;
    private javax.swing.JButton avanzar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel opc1;
    private javax.swing.JLabel opc2;
    private javax.swing.JLabel opc3;
    private javax.swing.JLabel opc4;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
