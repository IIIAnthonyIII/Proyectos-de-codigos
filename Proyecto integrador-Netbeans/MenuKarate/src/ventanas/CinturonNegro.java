/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Inscripcion.Estudiante;
import Inscripcion.OperacionEstudiante;
import clases.Preguntas.Preguntas;
import clases.Respuestas.Respuestas;
import java.awt.Toolkit;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menuk.Interface;

/**
 *
 * @author wesle
 */
public class CinturonNegro extends javax.swing.JFrame {
    int posicion = 0;
    Respuestas r = new Respuestas();
    Preguntas p = new Preguntas();
    String[] select = {"","","","","","","","","",""}; 
  
    int calificacion = 0;
    @SuppressWarnings("static-access")
    
    void dispo(){
  Interface Ventana = new Interface();
   Ventana.setVisible(true);
    Ventana.setResizable(false);
      Ventana.setLocationRelativeTo(null);
       this.setVisible(false);
    this.dispose();
    }
    
    public void Resultado()throws IOException{
        
         for(int i = 0; i < 10; i++){
            if(select[i].equals(r.getRespuesta(i))){
                calificacion = calificacion + 1;
            }
        }
    
    calificacion = calificacion * 1;

        JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
        String estado;
         if(calificacion<=6)
        {
            
            estado = "Reprobado";
            JOptionPane.showMessageDialog(null, "Usted ha Reprobado");
            OperacionResultados ot=new OperacionResultados(); ot.Resultado(calificacion,select,estado);
            dispo();
        }
        else
        {
            estado="Aprobado";
            JOptionPane.showMessageDialog(null, "Felicitaciones Usted ha Aprobado");
            Aprobacion ot=new Aprobacion();
//            ot.subirNivel("0956986020", 10);
            OperacionResultados o=new OperacionResultados(); o.Resultado(calificacion,select,estado);
             dispo();
        }
        
     
    }
    
    public CinturonNegro() {
        initComponents();
        setResizable(false);
        setTitle("Examen Cinturon Negro");
            setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.PNG")).getImage());
        setLocationRelativeTo(null);
        question.setText(p.getPregunta(posicion));
        String[] a = r.setRespuestas(posicion);
      
        buttonGroup1.clearSelection();
        opc1.setText(a[0]);
        opc2.setText(a[1]);
        opc3.setText(a[2]);
        opc4.setText(a[3]);
        opc1.requestFocus();
        regresar.setEnabled(false);
        terminarExamen.setEnabled(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        regresar = new javax.swing.JButton();
        terminarExamen = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Preguntas");

        question.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        question.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        question.setText("¿Pregunta 1?");
        question.setEnabled(false);
        question.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(opc1);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc2);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc4);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc3);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        regresar.setText("<< Regresar");
        regresar.setBorderPainted(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        terminarExamen.setText("Terminar Examen");
        terminarExamen.setBorderPainted(false);
        terminarExamen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        terminarExamen.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        terminarExamen.setDefaultCapable(false);
        terminarExamen.setEnabled(false);
        terminarExamen.setFocusPainted(false);
        terminarExamen.setSelected(true);
        terminarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarExamenActionPerformed(evt);
            }
        });

        avanzar.setText("Avanzar >>");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc2)
                            .addComponent(opc4)
                            .addComponent(opc3)
                            .addComponent(opc1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(question)))
                        .addContainerGap(588, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
                        .addComponent(avanzar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question)
                .addGap(27, 27, 27)
                .addComponent(opc1)
                .addGap(18, 18, 18)
                .addComponent(opc2)
                .addGap(18, 18, 18)
                .addComponent(opc4)
                .addGap(18, 18, 18)
                .addComponent(opc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(avanzar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(terminarExamen)
                .addGap(8, 8, 8))
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

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        select[posicion] = opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        select[posicion] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        select[posicion] = opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        select[posicion] = opc3.getLabel();
    }//GEN-LAST:event_opc3ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed

        if(posicion==0 ){
            regresar.setEnabled(false);
            terminarExamen.setEnabled(false);
        }
        if(posicion >0){
            avanzar.setEnabled(true);
            posicion--;
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); 
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_regresarActionPerformed

    private void terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarExamenActionPerformed

        try {
            Resultado();
          
        } catch (IOException ex) {
            Logger.getLogger(CinturonNegro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_terminarExamenActionPerformed

    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

        if(posicion == 8 ){
            avanzar.setEnabled(false);
            terminarExamen.setEnabled(true);
        }

        if(posicion <9){
            regresar.setEnabled(true);
            posicion++;
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection();
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();

        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_avanzarActionPerformed

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
            java.util.logging.Logger.getLogger(CinturonNegro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CinturonNegro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CinturonNegro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CinturonNegro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CinturonNegro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    private javax.swing.JButton terminarExamen;
    // End of variables declaration//GEN-END:variables
}
