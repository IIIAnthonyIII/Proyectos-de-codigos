package Inscripcion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inscripcion 
{
    
    String cedula;
    String nombre;
    String Ins;
    String nivel;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     
    public String getIns() {
        return Ins;
    }

    public void setIns(String cedIns) {
        this.Ins = cedIns;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void GuardarIncripcion(Estudiante estudiante, Instructor instructor) throws IOException
    {
        @SuppressWarnings("UnusedAssignment")
        FileWriter flwriter = null;
        flwriter = new FileWriter("Inscripcion.txt",true);
        BufferedWriter bfwriter= new BufferedWriter(flwriter);
        bfwriter.write(estudiante.getCedula()+","+estudiante.getNombre()+","+instructor.getNombre()+"," +instructor.getNivel()+",");
        bfwriter.close();
        flwriter.close();
     }
    
     public static Inscripcion BuscarEstud(String Cedula) throws FileNotFoundException
    {
        Inscripcion ins= new Inscripcion();
        File file = new File("Inscripcion.txt");
        Scanner cd;
        cd = new Scanner(file);
        while (cd.hasNextLine())
        {
            String Linea= cd.nextLine();
            Scanner delimitador= new Scanner(Linea);
            delimitador.useDelimiter("\\s*,\\s*");
            ins.setCedula(delimitador.next());
            ins.setNombre(delimitador.next());
            ins.setIns(delimitador.next());              
            ins.setNivel(delimitador.next());
           
            if (ins.getCedula().trim().equals(Cedula.trim()))
                break;  
        }
        cd.close();
        return ins;    
    }
}
