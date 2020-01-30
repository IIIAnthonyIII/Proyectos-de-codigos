/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OperacionResultados {


public void Resultado(int calificacion ,String select[], String estado)throws IOException{

 
        String []resultado1= new String[select.length];
        File archivo = new File("Resultados.txt");
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
}
