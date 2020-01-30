package ClasesdeRepuesto;


import Cuestionario.Cuestionario3;
import clases.Preguntas.Preguntas2;
import clases.Respuestas.Respuestas2;
import java.awt.Toolkit;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class exsegundodam extends javax.swing.JInternalFrame {
    
     int calificacion = 0;
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
            JOptionPane.showMessageDialog(null, "Usted ah Reprobado");
        }
        else
        {
            estado="Aprobado";
            JOptionPane.showMessageDialog(null, "Felicitaciones Usted ha Aprobado");
        }
         
        String []resultado1= new String[select.length];
        File archivo = new File("C:\\Dan\\Resultados.txt");
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
                           
            
            ar.close();
            escribe.close();
            es.close();
       
        
    } else{
        ar =new FileWriter(archivo,true);
            BufferedWriter escribe= new BufferedWriter(ar);
            PrintWriter es=new PrintWriter(escribe);
            System.arraycopy(select, 0, resultado1, 0, select.length);
            es.write("1era: "+resultado1[0]+","+"2da: "+resultado1[1]+","+"3era: "+resultado1[2]+","+"4ta: "+resultado1[3]+","+"5ta: "+resultado1[4]+","
                    + ""+"6ta: "+resultado1[5]+","+"7ma: "+resultado1[6]+","+"8va: "+resultado1[7]+","+"9na: "+resultado1[8]+","
             +"10ma: "+resultado1[9]+","+"Calificacion: "+calificacion+" Estado de Alumno: "+estado);
                           
            
            ar.close();
            escribe.close();
            es.close();
        
        }
    
    }
    
    public exsegundodam() {
        initComponents();
        question.setText(p.getPregunta2(posicion));
        String[] a = r.setRespuestas(posicion);
        buttonGroup2.clearSelection(); // sirve para borrar las selecciones de los radio button
        opc1.setText(a[0]);
        opc2.setText(a[1]);
        opc3.setText(a[2]);
        opc4.setText(a[3]);
        opc1.requestFocus();
        regresar.setEnabled(false);
        terminarExamen.setEnabled(false);
    }


    int posicion = 0;
    Respuestas2 r = new Respuestas2();
    Preguntas2 p = new Preguntas2();
    String[] select = {"","","","","","","","","",""};
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        terminarExamen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        avanzar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Preguntas");

        question.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        question.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        question.setText("¿Pregunta 1?");
        question.setEnabled(false);
        question.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        avanzar.setText("Avanzar >>");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        regresar.setText("<< Regresar");
        regresar.setBorderPainted(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        buttonGroup2.add(opc1);
        opc1.setText(" ");
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(opc2);
        opc2.setText(" ");

        buttonGroup2.add(opc3);
        opc3.setText(" ");

        buttonGroup2.add(opc4);
        opc4.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avanzar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc4)
                            .addComponent(opc3)
                            .addComponent(opc2)
                            .addComponent(opc1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 322, Short.MAX_VALUE)
                .addComponent(terminarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(question)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(question)
                .addGap(18, 18, 18)
                .addComponent(opc1)
                .addGap(18, 18, 18)
                .addComponent(opc2)
                .addGap(18, 18, 18)
                .addComponent(opc3)
                .addGap(18, 18, 18)
                .addComponent(opc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(avanzar))
                .addGap(9, 9, 9)
                .addComponent(terminarExamen)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarExamenActionPerformed
                
         try { 
             Resultado();
         } catch (IOException ex) {
             Logger.getLogger(exsegundodam.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_terminarExamenActionPerformed


                                
    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

        if(posicion == 8){
            avanzar.setEnabled(false);
            terminarExamen.setEnabled(true);
        }
        
        if(posicion < 9){
            regresar.setEnabled(true);
            posicion++;
            question.setText(p.getPregunta2(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup2.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_avanzarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
if(posicion == 0){
            regresar.setEnabled(false);
        }
        
        if(posicion > 0){
            posicion--;
            avanzar.setEnabled(true);
            question.setText(p.getPregunta2(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup2.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
       
    }//GEN-LAST:event_regresarActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        select[posicion] = opc1.getLabel();
    }                                    

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        select[posicion] = opc2.getLabel();
    }                                    

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        select[posicion] = opc3.getLabel();
    }                                    

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        select[posicion] = opc4.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed
                                   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    private javax.swing.JButton terminarExamen;
    // End of variables declaration//GEN-END:variables
}
