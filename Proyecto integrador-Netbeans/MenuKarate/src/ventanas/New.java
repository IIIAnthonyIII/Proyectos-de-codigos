/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.io.*;
import java.util.*;

public class New {
    static String []respuestas=new String[10];
    static String []resCo=new String[10];
    static String []preguntas= new String[10];

    public static String getResCo(int posicion) {
        return resCo[posicion];
    }

    public static void setResCo(String[] resCo) {
        New.resCo = resCo;
    }

    public String getPreguntas(int posicion) {
        return preguntas[posicion];
    }

    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }
    
    
    public String getRespuestas(int posicion) {
        return respuestas[posicion];
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }
    
     public String[] separar(String cadena, String separador){ 
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); 
            i++;
        }    return a;
    }
        
    public String[] setResp(int posicion){
        String s1 = respuestas[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
   
        
    
     public  New buscarCues(String direccion) throws FileNotFoundException
    {
        New preg= new New();
        File file = new File(direccion+".txt" );
        Scanner cd;
        cd = new Scanner(file);
        while (cd.hasNextLine())
        {
            String []tem=new String[10];
            String Linea= cd.nextLine();
            Scanner delimitador= new Scanner(Linea);
            delimitador.useDelimiter("\\s*,\\s*");
            tem[0]=delimitador.next();tem[1]=delimitador.next();tem[2]=delimitador.next();tem[3]=delimitador.next();
            tem[4]=delimitador.next();tem[5]=delimitador.next();tem[6]=delimitador.next();tem[7]=delimitador.next();
            tem[8]=delimitador.next();tem[9]=delimitador.next();
            preg.setPreguntas(tem);
                          
//            preg.setOpc11(delimitador.next());
//          preg.setOpc22(delimitador.next());
//            preg.setOpc33(delimitador.next());
//            preg.setOpc44(delimitador.next());
            
//            if (estudiante.getCedula().trim().equals(Cedula.trim()))
//                break;  
        }
        cd.close();
        return preg;    
    }
     
     public  New buscarRes(String direccion) throws FileNotFoundException
    {
        New preg= new New();
        File file = new File(direccion+".txt");
        Scanner cd;
        cd = new Scanner(file);
        while (cd.hasNextLine())
        {
            String []tem=new String[10];
            String Linea= cd.nextLine();
            Scanner delimitador= new Scanner(Linea);
            delimitador.useDelimiter("\\s*-\\s*");
            
            
            tem[0]=delimitador.next();tem[1]=delimitador.next();tem[2]=delimitador.next();tem[3]=delimitador.next();
            tem[4]=delimitador.next();tem[5]=delimitador.next();tem[6]=delimitador.next();tem[7]=delimitador.next();
            tem[8]=delimitador.next();tem[9]=delimitador.next();
            preg.setRespuestas(tem);
                          
//            preg.setOpc11(delimitador.next());
//          preg.setOpc22(delimitador.next());
//            preg.setOpc33(delimitador.next());
//            preg.setOpc44(delimitador.next());
            
//            if (estudiante.getCedula().trim().equals(Cedula.trim()))
//                break;  
        }
        cd.close();
        return preg;    
    }
     public  New buscarResco(String direccion) throws FileNotFoundException
    {
        New preg= new New();
        File file = new File(direccion+".txt");
        Scanner cd;
        cd = new Scanner(file);
        while (cd.hasNextLine())
        {
            String []tem=new String[10];
            String Linea= cd.nextLine();
            Scanner delimitador= new Scanner(Linea);
            delimitador.useDelimiter("\\s*,\\s*");
            tem[0]=delimitador.next();tem[1]=delimitador.next();tem[2]=delimitador.next();tem[3]=delimitador.next();
            tem[4]=delimitador.next();tem[5]=delimitador.next();tem[6]=delimitador.next();tem[7]=delimitador.next();
            tem[8]=delimitador.next();tem[9]=delimitador.next();
            preg.setResCo(tem);
                          
//            preg.setOpc11(delimitador.next());
//          preg.setOpc22(delimitador.next());
//            preg.setOpc33(delimitador.next());
//            preg.setOpc44(delimitador.next());
            
//            if (estudiante.getCedula().trim().equals(Cedula.trim()))
//                break;  
        }
        cd.close();
        return preg;    
    }
     
     public static void main(String []a) throws FileNotFoundException{
         New at= new New();
        
   at.buscarCues("P");
         for(int i=0; i<10;i++){System.out.println(preguntas[i]);}
         
         at.buscarRes("R");
         for(int i=0; i<10;i++){System.out.println(respuestas[i]);}
     
     }
}
