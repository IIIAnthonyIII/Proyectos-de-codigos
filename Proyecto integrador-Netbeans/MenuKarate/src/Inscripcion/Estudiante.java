package Inscripcion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ventanas.Aprobacion;
import static ventanas.Aprobacion.estudiantes;

public class Estudiante 
{
   private String Cedula;
   private String Nombre;
   private String Apellido;
   private String Edad;
   private String Telefono;
   private String Direccion;
   int nivel;
public static List<Estudiante> estudiantes;
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public Estudiante(){
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public static boolean isInt(String str){
   boolean entero=true;
  char[] strch=str.toCharArray();
   for(int i=0;i<strch.length;i++){
   if(!Character.isDigit(strch[i])){
       entero=false;
   }
   }
   return entero;
  }
    
    public Estudiante(String Nombre, String Apellido, String Edad, String Telefono ,
            String Direccion,String cedula, int nivelAprobado){
       this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Cedula=cedula;
        this.nivel= nivel;
      
 
      
      }
        
      public  static void agregarArchivo(Estudiante estudiante) throws IOException{
     File file=new File("Estudiantes.txt");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bfWriter;
        bfWriter = new BufferedWriter(fw);
//            bfWriter.write(""); 
            bfWriter.write(estudiante.getCedula()+","+estudiante.getNombre()+","+estudiante.getApellido()
                    +","+estudiante.getEdad()+","+estudiante.getTelefono()+","+estudiante.getDireccion()
                    +","+estudiante.getNivel()+","+"\r\n");
            bfWriter.close();
            fw.close();
      }
public static void leerArchivo(){
    estudiantes=new ArrayList<>();
    File file=new File("Estudiantes.txt");
     Scanner reader;
    String line;
    try{
    reader=new Scanner(file);
   
    while(reader.hasNextLine()){
    line= reader.nextLine();
    
    Scanner delimiter=new Scanner(line);
    delimiter.useDelimiter("\\s*,\\s*");
    estudiantes.add( new Estudiante(delimiter.next(),delimiter.next(),delimiter.next(),
            delimiter.next(),delimiter.next(),delimiter.next(),Integer.parseInt(delimiter.next())));
    }
    }catch(FileNotFoundException s){
    System.out.println("fdfd");
    }
    
    }

 public static void subirNivel(String cedula,int nivel) throws IOException{
        leerArchivo();
        for(Estudiante d:estudiantes){
            if(d.getCedula().equals(cedula)){
                d.setNivel(nivel);
//                modificarLista();
           File file=new File("Estudiantes.txt");
           FileWriter fw=new FileWriter(file,true);
             for(Estudiante r:estudiantes){
              agregarArchivo(r);}
            }
        }
        
    }
    static void modificarLista() throws IOException{
    crearArchivo();
    for(Estudiante r:estudiantes){
      agregarArchivo(r);
    }
    }
    public  static void crearArchivo() throws IOException{
       File file=new File("Estudiantes.txt");
        FileWriter fw=new FileWriter(file,true);
    }
}
