/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesdeRepuesto;

/**
 *
 * @author wesle
 */
import Inscripcion.Instructor;
import Inscripcion.OperacionInstructor;
import java.io.*;
import javax.swing.JOptionPane;

public class Up {
    
    public String leerArchivo(){
    String cadena = "";
    FileReader entrada = null;
    try {
        entrada = new FileReader("C:\\Dan\\Estudiantes.txt");
        int c;
        while((c = entrada.read()) != -1){
            cadena += (char)c;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al leer archivo: "+e.getMessage());
    }
    return cadena;
}
    OperacionInstructor o= new OperacionInstructor();

    public void ingresar(String nuevaLinea, int posicion){
    FileWriter fichero = null;
    PrintWriter escritor = null;
    try {
        fichero = new FileWriter("C:\\Dan\\Inscripcion.txt");
        escritor = new PrintWriter(fichero);
        escritor.flush();
        String split[] = leerArchivo().split(",");
        split[posicion] = nuevaLinea;
        for(int x = 0; x < split.length; x++){
            escritor.write(split[x]);
            escritor.println();
         }
        escritor.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al escribir en el archivo de texto: "+e.getMessage());
    } finally {
        if(fichero != null){
            try {
                fichero.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar archivo de texto: "+e.getMessage());
            }
        }
    }
}
    
   public static void main(String []a){
   Up o= new Up();
   o.ingresar("Dan 2",3);
   } 
}
