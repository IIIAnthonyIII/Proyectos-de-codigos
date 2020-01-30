/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesdeRepuesto;

import Inscripcion.Estudiante;
import Inscripcion.Inscripcion;
import static Inscripcion.Inscripcion.BuscarEstud;
import static Inscripcion.OperacionEstudiante.BuscarEstudiante;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menuk.Interface;
import menuk.VentanaInscripcion;
import ventanas.NuevaPrueba;

import javax.swing.JOptionPane;
import ventanas.CinturonNegro;

public class VentanaExamen extends javax.swing.JFrame {

    
    public VentanaExamen() {
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
            setResizable(false);
            setTitle("Examen");
            setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.PNG")).getImage());
        cintanegra.setEnabled(false);
        primerdam.setEnabled(false);
        segundodam.setEnabled(false);
        tercerdam.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cedprue = new javax.swing.JTextField();
        ingreprue = new javax.swing.JButton();
        Lnomb = new javax.swing.JLabel();
        Lnivel = new javax.swing.JLabel();
        nomIn = new javax.swing.JLabel();
        regre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cintanegra = new javax.swing.JButton();
        primerdam = new javax.swing.JButton();
        segundodam = new javax.swing.JButton();
        tercerdam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Super Street Fighter Hyper Font", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Bienvenido al Examen de la Federacion Madrileña de Karate");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Digite su numero de Cedula");

        ingreprue.setText("Ingresar");
        ingreprue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreprueActionPerformed(evt);
            }
        });

        Lnomb.setBackground(new java.awt.Color(0, 153, 204));
        Lnomb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lnomb.setText("Nombre del Estudiante");

        Lnivel.setBackground(new java.awt.Color(0, 153, 153));
        Lnivel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lnivel.setText("Nivel del Estudiante");

        nomIn.setBackground(new java.awt.Color(0, 102, 102));
        nomIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomIn.setText("Nombre Instructor");

        regre.setText("Regresar");
        regre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cedprue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ingreprue))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomIn)
                            .addComponent(Lnomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lnivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreprue)
                    .addComponent(cedprue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addComponent(Lnomb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lnivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(regre)
                .addContainerGap())
        );

        cintanegra.setText("CINTURÓN NEGRO");
        cintanegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cintanegraActionPerformed(evt);
            }
        });

        primerdam.setText("PRIMER DAN");
        primerdam.setPreferredSize(new java.awt.Dimension(136, 26));
        primerdam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerdamActionPerformed(evt);
            }
        });

        segundodam.setText("SEGUNDO DAN");
        segundodam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundodamActionPerformed(evt);
            }
        });

        tercerdam.setText("TERCER DAN");
        tercerdam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tercerdamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cintanegra, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(primerdam, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                    .addComponent(segundodam, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(tercerdam, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(primerdam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(segundodam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tercerdam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cintanegra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(8, 8, 8)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingreprueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreprueActionPerformed
        if(cedprue.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Ingrese Numero de Cedula");
        }
        else{ Inscripcion leer = new Inscripcion();

            try{
                leer = BuscarEstud(cedprue.getText().trim());
            }catch(IOException ex){
                Logger.getLogger(VentanaInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
            Lnomb.setText(leer.getNombre());
            Lnivel.setText(leer.getNivel());
            nomIn.setText(leer.getIns());
            switch (leer.getNivel()){
                case "Dan 1": cintanegra.setEnabled(true);
                break;
                case "Dan 2": primerdam.setEnabled(true);
                break;
                case "Dan 3": segundodam.setEnabled(true);
                break;
                case "Dan 4": tercerdam.setEnabled(true);}

        }
    }//GEN-LAST:event_ingreprueActionPerformed

    private void regreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regreActionPerformed
        Interface A=new Interface();
        A.setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_regreActionPerformed

    private void cintanegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cintanegraActionPerformed
        CinturonNegro ot=new CinturonNegro();
        ot.setVisible(true);
    }//GEN-LAST:event_cintanegraActionPerformed

    private void primerdamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerdamActionPerformed
       
    }//GEN-LAST:event_primerdamActionPerformed

    private void segundodamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundodamActionPerformed
        
    }//GEN-LAST:event_segundodamActionPerformed

    private void tercerdamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tercerdamActionPerformed
        
    }//GEN-LAST:event_tercerdamActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaExamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lnivel;
    private javax.swing.JLabel Lnomb;
    private javax.swing.JTextField cedprue;
    private javax.swing.JButton cintanegra;
    private javax.swing.JButton ingreprue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomIn;
    private javax.swing.JButton primerdam;
    private javax.swing.JButton regre;
    private javax.swing.JButton segundodam;
    private javax.swing.JButton tercerdam;
    // End of variables declaration//GEN-END:variables
}
