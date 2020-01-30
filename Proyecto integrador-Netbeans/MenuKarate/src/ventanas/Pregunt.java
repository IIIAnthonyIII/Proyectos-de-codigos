
package ventanas;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menuk.*;
/**
 *
 * @author wesle
 */
public class Pregunt extends javax.swing.JFrame {

    public Pregunt() {
        
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.PNG")).getImage());
        setTitle("Elaborar Nuevo Cuestionario");
        
        initComponents();
        setLocationRelativeTo(null);
         pregun.setEnabled(false);
      opc1.setEnabled(false);
      opc2.setEnabled(false);
      opc3.setEnabled(false);
      opc4.setEnabled(false);
      resco.setEnabled(false);
      guardarpre.setEnabled(false);
      limpiar.setEnabled(false);
      
    }

    public void crea(){
// String ba= File.separator;
// String ubicacion= System.getProperty("user.dir")+ba+"Pregu"+ba;
 
 String archivo=nombrecuestio.getText()+".txt";
 File crea_ar= new File("C:\\24\\"+nombrecuestio.getText()+".txt");
 
 String archivo2=nombR.getText()+".txt";
 File crea_arR= new File("C:\\24\\"+nombR.getText()+".txt");
 //FileWriter fw;
 
  String archivo3=nombR.getText()+".txt";
 File crea_arR3= new File("C:\\24\\"+nomC.getText()+".txt");
 
 if(crea_ar.exists()&& crea_arR.exists() && crea_arR3.exists()){
 JOptionPane.showMessageDialog(null,"Archivo existente. Desea Modificar?");}
 else{
 }
 }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inpre = new javax.swing.JLabel();
        pregun = new javax.swing.JTextField();
        inpre1 = new javax.swing.JLabel();
        res = new javax.swing.JLabel();
        opc1 = new javax.swing.JTextField();
        opc2 = new javax.swing.JTextField();
        opc3 = new javax.swing.JTextField();
        opc4 = new javax.swing.JTextField();
        guardarpre = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        nombrecuestio = new javax.swing.JTextField();
        hacer = new javax.swing.JButton();
        nombR = new javax.swing.JTextField();
        cuestiontal = new javax.swing.JLabel();
        labelcan = new javax.swing.JLabel();
        resco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nomC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lopc1 = new javax.swing.JLabel();
        lopc2 = new javax.swing.JLabel();
        lopc3 = new javax.swing.JLabel();
        lopc4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        inpre.setText("Ingrese Preguntas");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pregun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pregunActionPerformed(evt);
            }
        });

        inpre1.setText("Ingrese Preguntas");

        res.setText("Ingrese las Alternativas");

        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        guardarpre.setText("Guardar Pregunta");
        guardarpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarpreActionPerformed(evt);
            }
        });

        salir.setText("Regresar");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        nombrecuestio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrecuestioActionPerformed(evt);
            }
        });

        hacer.setText("Realizar Cuestionario");
        hacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerActionPerformed(evt);
            }
        });

        nombR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombRActionPerformed(evt);
            }
        });

        cuestiontal.setText("Nombre del archivo Preguntas");

        labelcan.setText("Nombre del archivo Respuestas");

        resco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rescoActionPerformed(evt);
            }
        });

        jLabel1.setText("Respuesta Correcta:");

        nomC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomCActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del archivo Correctas:");

        lopc1.setText("Opc 1:");

        lopc2.setText("Opc 2:");

        lopc3.setText("Opc 3:");

        lopc4.setText("Opc 4:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Pregunta:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("Aviso: Cada cuestionario creado tendra un maximo y minimo de 10 preguntas con sus respectivas opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(guardarpre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(limpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(salir))))
                            .addComponent(hacer)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lopc3)
                                        .addGap(18, 18, 18)
                                        .addComponent(opc3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lopc4)
                                        .addGap(18, 18, 18)
                                        .addComponent(opc4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lopc2)
                                        .addGap(18, 18, 18)
                                        .addComponent(opc2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lopc1)
                                        .addGap(18, 18, 18)
                                        .addComponent(opc1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(234, 234, 234)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(res)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(inpre1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pregun, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cuestiontal)
                        .addGap(18, 18, 18)
                        .addComponent(nombrecuestio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelcan)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombR, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(nomC))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrecuestio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuestiontal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcan))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hacer)
                    .addComponent(nomC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(inpre1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pregun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addComponent(res)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lopc1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lopc2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lopc3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lopc4))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarpre)
                    .addComponent(limpiar)
                    .addComponent(salir))
                .addGap(31, 31, 31)
                .addComponent(jLabel8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pregunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pregunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pregunActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc4ActionPerformed

    private void guardarpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarpreActionPerformed
        if(pregun.getText().isEmpty() || opc1.getText().isEmpty() || opc2.getText().isEmpty() || opc3.getText().isEmpty() || opc4.getText().isEmpty() || resco.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane,"Por Favor Complete todas las Casillas");
        }else{
        Pretxt ot= new Pretxt();
        ot.setPre(pregun.getText().trim());
        ot.setOpc11(opc1.getText().trim());
        ot.setOpc22(opc2.getText().trim());
        ot.setOpc33(opc3.getText().trim());
        ot.setOpc44(opc4.getText().trim());
        ot.setReC(resco.getText().trim());
        Pretxt o=new Pretxt();
        
        try {
            o.crea(ot,nombrecuestio.getText()+".txt",nombR.getText()+".txt",nomC.getText()+".txt");
        } catch (IOException ex) {
            Logger.getLogger(Pregunt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(rootPane,"GUARDADO");
    }  
    }//GEN-LAST:event_guardarpreActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        pregun.setText("");
        opc1.setText("");
        opc2.setText("");
        opc3.setText("");
        opc4.setText("");
        resco.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       Interface A=new Interface();
        A.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_salirActionPerformed

    private void nombrecuestioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrecuestioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrecuestioActionPerformed

    private void hacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerActionPerformed
       
        if(nombrecuestio.getText().isEmpty() && nomC.getText().isEmpty() && nombR.getText().isEmpty() ){
           JOptionPane.showMessageDialog(rootPane,"Por favor Complete los Campos");  }
        else{
            crea();
        pregun.setEnabled(true);
        opc1.setEnabled(true);
        opc2.setEnabled(true);
        opc3.setEnabled(true);
        opc4.setEnabled(true);
        resco.setEnabled(true);
        guardarpre.setEnabled(true);
      limpiar.setEnabled(true);
      
        }

    }//GEN-LAST:event_hacerActionPerformed

    private void nombRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombRActionPerformed
        
    }//GEN-LAST:event_nombRActionPerformed

    private void rescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rescoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rescoActionPerformed

    private void nomCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomCActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuestiontal;
    private javax.swing.JButton guardarpre;
    private javax.swing.JButton hacer;
    private javax.swing.JLabel inpre;
    private javax.swing.JLabel inpre1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelcan;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel lopc1;
    private javax.swing.JLabel lopc2;
    private javax.swing.JLabel lopc3;
    private javax.swing.JLabel lopc4;
    private javax.swing.JTextField nomC;
    private javax.swing.JTextField nombR;
    private javax.swing.JTextField nombrecuestio;
    private javax.swing.JTextField opc1;
    private javax.swing.JTextField opc2;
    private javax.swing.JTextField opc3;
    private javax.swing.JTextField opc4;
    private javax.swing.JTextField pregun;
    private javax.swing.JLabel res;
    private javax.swing.JTextField resco;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
