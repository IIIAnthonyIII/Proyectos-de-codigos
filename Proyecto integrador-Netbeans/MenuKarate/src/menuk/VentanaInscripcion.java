package menuk;

import Inscripcion.Estudiante;
import Inscripcion.Instructor;
import static Inscripcion.OperacionEstudiante.BuscarEstudiante;
import static Inscripcion.Inscripcion.GuardarIncripcion;
import static Inscripcion.OperacionInstructor.BuscarInstructor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaInscripcion extends javax.swing.JFrame {
    public VentanaInscripcion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Interface");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.PNG")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcedest = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Lbced = new javax.swing.JLabel();
        Lbnom = new javax.swing.JLabel();
        Lbapel = new javax.swing.JLabel();
        Lbedad = new javax.swing.JLabel();
        Lbtel = new javax.swing.JLabel();
        Lbdir = new javax.swing.JLabel();
        BtLimpiar = new javax.swing.JButton();
        Lbcedi = new javax.swing.JLabel();
        Lbnomi = new javax.swing.JLabel();
        Lbapeli = new javax.swing.JLabel();
        Lbsaloni = new javax.swing.JLabel();
        Lbniveli = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtverificarEstudiante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnomIn = new javax.swing.JTextField();
        BtVerificarInstructor = new javax.swing.JButton();
        BtGuardar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Inscripcion ");

        jLabel2.setText("Cedula Estudiante");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        Lbced.setText("-");

        Lbnom.setText("-");

        Lbapel.setText("-");

        Lbedad.setText("-");

        Lbtel.setText("-");

        Lbdir.setText("-");

        BtLimpiar.setText("Limpiar");
        BtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpiarActionPerformed(evt);
            }
        });

        Lbcedi.setText("-");

        Lbnomi.setText("-");

        Lbapeli.setText("-");

        Lbsaloni.setText("-");

        Lbniveli.setText("-");

        jLabel4.setText("Estudiante");

        jLabel5.setText("Instructor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbtel)
                            .addComponent(Lbedad)
                            .addComponent(Lbapel)
                            .addComponent(Lbced)
                            .addComponent(Lbnom)
                            .addComponent(Lbdir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbcedi)
                    .addComponent(BtLimpiar)
                    .addComponent(Lbnomi)
                    .addComponent(Lbapeli)
                    .addComponent(Lbsaloni)
                    .addComponent(Lbniveli))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbcedi)
                    .addComponent(Lbced))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbnomi)
                    .addComponent(Lbnom))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbapeli)
                    .addComponent(Lbapel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbsaloni)
                    .addComponent(Lbedad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbniveli)
                    .addComponent(Lbtel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbdir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(BtLimpiar)
                .addContainerGap())
        );

        BtverificarEstudiante.setText("Verificar Estudiante");
        BtverificarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtverificarEstudianteActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Instructor");

        BtVerificarInstructor.setText("Verificar Instructor");
        BtVerificarInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVerificarInstructorActionPerformed(evt);
            }
        });

        BtGuardar.setText("Guardar Inscripcion");
        BtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGuardarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtverificarEstudiante)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcedest, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtnomIn)))
                    .addComponent(BtVerificarInstructor)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(BtGuardar)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtcedest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtverificarEstudiante)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnomIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BtVerificarInstructor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtGuardar)
                                .addGap(14, 14, 14))
                            .addComponent(regresar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtverificarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtverificarEstudianteActionPerformed
       if(txtcedest.getText().isEmpty()){
       JOptionPane.showMessageDialog(rootPane,"Ingrese Numero de Cedula");
       }
       else{ Estudiante leer = new Estudiante();
        
        try{
            leer = BuscarEstudiante(txtcedest.getText().trim());
        }catch(IOException ex){
            Logger.getLogger(VentanaInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Lbced.setText(leer.getCedula());
        Lbnom.setText(leer.getNombre());
        Lbapel.setText(leer.getApellido());
        Lbedad.setText(leer.getEdad());
        Lbtel.setText(leer.getTelefono());
        Lbdir.setText(leer.getDireccion());
       }
    }//GEN-LAST:event_BtverificarEstudianteActionPerformed

    private void BtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpiarActionPerformed
       Lbced.setText("-");
       Lbnom.setText("-");
       Lbapel.setText("-");
       Lbedad.setText("-");
       Lbtel.setText("-");
       Lbdir.setText("-");
       Lbcedi.setText("-");
       Lbnomi.setText("-");
       Lbapeli.setText("-");
       Lbsaloni.setText("-");
       Lbniveli.setText("-");
    }//GEN-LAST:event_BtLimpiarActionPerformed

    private void BtVerificarInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVerificarInstructorActionPerformed
        if(txtnomIn.getText().isEmpty()){
       JOptionPane.showMessageDialog(rootPane,"Ingrese Numero de Cedula");
       }else{ 
        Instructor leer = new Instructor();
        
        try{
            leer = BuscarInstructor(txtnomIn.getText().trim());
        }catch(IOException ex){
            Logger.getLogger(VentanaInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Lbcedi.setText(leer.getCedula());
        Lbnomi.setText(leer.getNombre());
        Lbapeli.setText(leer.getApellido());
        Lbsaloni.setText(leer.getSalon());
        Lbniveli.setText(leer.getNivel());
        }
    }//GEN-LAST:event_BtVerificarInstructorActionPerformed

    private void BtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGuardarActionPerformed
      
        if(txtcedest.getText().isEmpty() || txtcedest.getText().isEmpty()){
       JOptionPane.showMessageDialog(rootPane,"Por favor Inscribase");
       
       }else{
        Estudiante datosestudiante = new Estudiante();
        Instructor datosinstructor = new Instructor();
        
        datosestudiante.setCedula(Lbced.getText());
        datosestudiante.setNombre(Lbnom.getText());
        datosinstructor.setCedula(Lbcedi.getText());
        datosinstructor.setNombre(Lbnomi.getText());
        datosinstructor.setNivel(Lbniveli.getText());
       
        try
        {
            GuardarIncripcion(datosestudiante,datosinstructor);
            JOptionPane.showMessageDialog(null,"Su Inscripcion ha sido Realizada");
        }
        catch(IOException ex){
            Logger.getLogger(VentanaInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_BtGuardarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Interface A=new Interface();
        A.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtGuardar;
    private javax.swing.JButton BtLimpiar;
    private javax.swing.JButton BtVerificarInstructor;
    private javax.swing.JButton BtverificarEstudiante;
    private javax.swing.JLabel Lbapel;
    private javax.swing.JLabel Lbapeli;
    private javax.swing.JLabel Lbced;
    private javax.swing.JLabel Lbcedi;
    private javax.swing.JLabel Lbdir;
    private javax.swing.JLabel Lbedad;
    private javax.swing.JLabel Lbniveli;
    private javax.swing.JLabel Lbnom;
    private javax.swing.JLabel Lbnomi;
    private javax.swing.JLabel Lbsaloni;
    private javax.swing.JLabel Lbtel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField txtcedest;
    private javax.swing.JTextField txtnomIn;
    // End of variables declaration//GEN-END:variables
}
