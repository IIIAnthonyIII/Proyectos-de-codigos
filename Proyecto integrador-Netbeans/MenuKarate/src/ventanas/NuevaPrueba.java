/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


import java.awt.Toolkit;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author wesle
 */
public class NuevaPrueba extends javax.swing.JFrame {
    
     int calificacion = 0;
    public void Resultado()throws IOException{
        
         for(int i = 0; i < 10; i++){
            if(select[i].equals(r.getResCo(i))){
                calificacion = calificacion + 1;
            }
        }
    
    calificacion = calificacion * 1;

        JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
        String estado;
         if(calificacion<=6)
        {
            
            estado = "Reprobado";
            JOptionPane.showMessageDialog(null, "Usted ah Reprobado");
        }
        else
        {
            estado="Aprobado";
            JOptionPane.showMessageDialog(null, "Felicitaciones Usted ha Aprobado");
        }
         
        String []resultado1= new String[select.length];
        File archivo = new File("ResultadosPN.txt");
        FileWriter ar=null;
        if(!(archivo.exists())){
             archivo.createNewFile();
            ar =new FileWriter(archivo,true);
            BufferedWriter escribe= new BufferedWriter(ar);
            PrintWriter es=new PrintWriter(escribe);
            System.arraycopy(select, 0, resultado1, 0, select.length);
            es.write("1era: "+resultado1[0]+","+"2da: "+resultado1[1]+","+"3era: "+resultado1[2]+","+"4ta: "+resultado1[3]+","+"5ta: "+resultado1[4]+","
                    + ""+"6ta: "+resultado1[5]+","+"7ma: "+resultado1[6]+","+"8va: "+resultado1[7]+","+"9na: "+resultado1[8]+","
             +"10ma: "+resultado1[9]+","+"Calificacion: "+calificacion+" Estado de Alumno: "+estado);
                           
             es.close();
            ar.close();
            escribe.close();
           
       
        
    } else{
        ar =new FileWriter(archivo,true);
            BufferedWriter escribe= new BufferedWriter(ar);
            PrintWriter es=new PrintWriter(escribe);
            System.arraycopy(select, 0, resultado1, 0, select.length);
            es.write("1era: "+resultado1[0]+","+"2da: "+resultado1[1]+","+"3era: "+resultado1[2]+","+"4ta: "+resultado1[3]+","+"5ta: "+resultado1[4]+","
                    + ""+"6ta: "+resultado1[5]+","+"7ma: "+resultado1[6]+","+"8va: "+resultado1[7]+","+"9na: "+resultado1[8]+","
             +"10ma: "+resultado1[9]+","+"Calificacion: "+calificacion+" Estado de Alumno: "+estado);
                           
             es.close();
            ar.close();
            escribe.close();
           
        
        }
    
    }

        
    int posicion = 0;
    New r = new New();
    New p = new New();
    String[] select = {"","","","","","","","","",""}; 
    public NuevaPrueba() {
        initComponents();
        setTitle("Nueva Prueba");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.PNG")).getImage());
        setResizable(false);
        setLocationRelativeTo(null);
        question.setText(p.getPreguntas(posicion));
        String[] a = r.setResp(posicion);
      
        buttonGroup1.clearSelection();// sirve para borrar las selecciones de los radio button
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
        question = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        regresar = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        terminarExamen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        avanzar.setText("Avanzar >>");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Preguntas");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avanzar))
                    .addComponent(opc2)
                    .addComponent(opc4)
                    .addComponent(opc3)
                    .addComponent(opc1)
                    .addComponent(question))
                .addContainerGap(463, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(question)
                .addGap(32, 32, 32)
                .addComponent(opc1)
                .addGap(18, 18, 18)
                .addComponent(opc2)
                .addGap(18, 18, 18)
                .addComponent(opc4)
                .addGap(18, 18, 18)
                .addComponent(opc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(avanzar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminarExamen)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            question.setText(p.getPreguntas(posicion));
            String[] a = r.setResp(posicion);
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_regresarActionPerformed

    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

        if(posicion == 8 ){
            avanzar.setEnabled(false);
            terminarExamen.setEnabled(true);
        }

        if(posicion <9){
            regresar.setEnabled(true);
            posicion++;
            question.setText(p.getPreguntas(posicion));
            String[] a = r.setResp(posicion);
            buttonGroup1.clearSelection();// sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();

        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_avanzarActionPerformed

    private void terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarExamenActionPerformed

         try {
             Resultado();
         } catch (IOException ex) {
             Logger.getLogger(NuevaPrueba.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_terminarExamenActionPerformed

    /**
     * @param args the command line arguments
     */
    

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
