package Inscripcion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import ventanas.Aprobacion;

public class OperacionEstudiante 
{
    
//    public static List<Estudiante> estudiantes;
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void GuardarArchivo(Estudiante estudiante) throws IOException
    {
        
        Instructor ins= new Instructor();
        @SuppressWarnings("UnusedAssignment")
        FileWriter flwriter = null;
        flwriter = new FileWriter("Estudiantes.txt",true );
        BufferedWriter bfwriter= new BufferedWriter(flwriter);
        bfwriter.write(estudiante.getCedula()+","+estudiante.getNombre()+","+estudiante.getApellido()+","+estudiante.getEdad()+"," +estudiante.getTelefono()+","+estudiante.getDireccion()+","+ 1+"\n");
        bfwriter.close();
        flwriter.close();
    }
    
    

    public static Estudiante BuscarEstudiante(String Cedula) throws FileNotFoundException
    {
        Estudiante estudiante= new Estudiante();
        File file = new File("Estudiantes.txt" );
        Scanner cd;
        cd = new Scanner(file);
        while (cd.hasNextLine())
        {
            String Linea= cd.nextLine();
            Scanner delimitador= new Scanner(Linea);
            delimitador.useDelimiter("\\s*,\\s*");
            estudiante.setCedula(delimitador.next());
                          
            estudiante.setNombre(delimitador.next());
            estudiante.setApellido(delimitador.next());
            estudiante.setEdad(delimitador.next());
            estudiante.setTelefono(delimitador.next());
            estudiante.setDireccion(delimitador.next());
            estudiante.setNivel(Integer.parseInt(delimitador.next()));
            if (estudiante.getCedula().trim().equals(Cedula.trim()))
                break;  
        }
        cd.close();
        return estudiante;    
    }
    
    
    
//    public static Estudiante rEstudiante(String Cedula, int nivel) throws FileNotFoundException, IOException
//    {
//        Estudiante estudiante= new Estudiante();
//        File file = new File("Estudiantes.txt");
//        Scanner cd;
//        cd = new Scanner(file);
//        
//        while (cd.hasNextLine())
//        {
//            String Linea= cd.nextLine();
//            Scanner delimitador= new Scanner(Linea);
//            delimitador.useDelimiter("\\s*,\\s*");
//            estudiante.setCedula(delimitador.next());
//                          
//            estudiante.setNombre(delimitador.next());
//            estudiante.setApellido(delimitador.next());
//            estudiante.setEdad(delimitador.next());
//            estudiante.setTelefono(delimitador.next());
//            estudiante.setDireccion(delimitador.next());
//            estudiante.setNivel(nivel);
//            if (estudiante.getCedula().trim().equals(Cedula.trim())){
//                FileWriter fb= new FileWriter("Estudiantes.txt",true);
//                BufferedWriter bf= new BufferedWriter(fb);
//                bf.write(estudiante.getNivel());
//            bf.close();
//            fb.close();
//                break;  }
//        
//        }
//        
//        cd.close();
//        return estudiante;    
//    }
    
public static Estudiante rEstudiante(String Cedula, int nivel) throws FileNotFoundException, IOException
    {
        Estudiante estudiante= new Estudiante();
        File file = new File("Estudiantes.txt");
        Scanner cd;
        cd = new Scanner(file);
        
        while (cd.hasNextLine())
        {
            String Linea= cd.nextLine();
            Scanner delimitador= new Scanner(Linea);
            delimitador.useDelimiter("\\s*,\\s*");
            estudiante.setCedula(delimitador.next());
                          
            estudiante.setNombre(delimitador.next());
            estudiante.setApellido(delimitador.next());
            estudiante.setEdad(delimitador.next());
            estudiante.setTelefono(delimitador.next());
            estudiante.setDireccion(delimitador.next());
            estudiante.setNivel(nivel);
            if (estudiante.getCedula().trim().equals(Cedula.trim())){
                FileWriter fb= new FileWriter("Estudiantes.txt",true);
                BufferedWriter bf= new BufferedWriter(fb);
                bf.write(estudiante.getNivel());
            bf.close();
            fb.close();
                break;  }
        
        }
        
        cd.close();
        return estudiante;    
    }

    
}

