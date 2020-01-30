package Inscripcion;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OperacionInstructor 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void GuardarArchivo(Instructor instructor) throws IOException
    {
        @SuppressWarnings("UnusedAssignment")
        FileWriter flwriter = null;
        flwriter = new FileWriter("Instructor.txt",true);
        BufferedWriter bfwriter= new BufferedWriter(flwriter);
        bfwriter.write(instructor.getCedula()+","+instructor.getNombre()+","+instructor.getApellido()+","+instructor.getSalon()+"," +instructor.getNivel()+",");
        bfwriter.close();
        flwriter.close();
     }
    
//    public  String leerArchivo() throws FileNotFoundException
//    {
//        String a = null;
//        Instructor instructor= new Instructor();
//        File file = new File("D:\\Dan\\Instructor.txt" );
//        Scanner cd;
//        cd = new Scanner(file);
//        while (cd.hasNextLine())
//        {
//             a= cd.nextLine();
//            
//            
//            
//        }
//        cd.close();
//        return a;    
//    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static Instructor BuscarInstructor(String nombre) throws FileNotFoundException
    {
        Instructor buscar =new Instructor();
        File archivo=new File("Instructor.txt");
        BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
        Scanner cd;
        cd=new Scanner(archivo);
        while(cd.hasNextLine())
        {
            String Linea = cd.nextLine();
            Scanner delimitador= new Scanner(Linea);
            delimitador.useDelimiter("\\s*,\\s*");
            buscar.setCedula(delimitador.next());
            buscar.setNombre(delimitador.next());
            buscar.setApellido(delimitador.next());
            buscar.setSalon(delimitador.next());
            buscar.setNivel(delimitador.next());
            if(buscar.getNombre().trim().equals(nombre.trim()))
                break;
        }
        cd.close();
        return buscar;
    }
}
