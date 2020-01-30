   
package ventanas;

import Inscripcion.Estudiante;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Aprobacion {

   public  static List<Aprobacion> estudiantes;
   private String Nombre;
   private String Apellido;
   private String Edad;
   private String Telefono;
   private String Direccion;
   
  public  int nivelAprobado;

    public int getNivelAprobado() {
        return nivelAprobado;
    }

    public void setNivelAprobado(int nivelAprobado) {
        this.nivelAprobado = nivelAprobado;
    }
  public  String ced;
    
   

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
    
  

    

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }
  
  
    public Aprobacion(){}
  
    public Aprobacion(String Nombre, String Apellido, String Edad, String Telefono , String Direccion,String ced, int nivelAprobado){
       this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.ced=ced;
        this.nivelAprobado= nivelAprobado;
      
 
      
      }
        
    
 public static void subirNivel(String cedula,int nivel) throws IOException{
        leerArchivo();
        for(Aprobacion d:estudiantes){
            if(d.getCed().equals(cedula)){
                d.setNivelAprobado(nivel);
//                modificarLista();
//           File file=new File("Estudiantes.txt");
//           FileWriter fw=new FileWriter(file,true);
             for(Aprobacion r:estudiantes){
              agregarArchivo(r);}
            }
        }
        
    }
    
      public  static void agregarArchivo(Aprobacion estudiante) throws IOException{
     File file=new File("Estudiantes.txt");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bfWriter;
        bfWriter = new BufferedWriter(fw);
//            bfWriter.write(""); 
            bfWriter.write(estudiante.getCed()+","+estudiante.getNombre()+","+estudiante.getApellido()+","+estudiante.getEdad()+","+estudiante.getTelefono()+","+estudiante.getDireccion()+","+estudiante.getNivelAprobado()+",");
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
        estudiantes.add(new Aprobacion(delimiter.next(),delimiter.next(),
                delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),
                Integer.parseInt(delimiter.next())));
    }
    }catch(FileNotFoundException s){
    System.out.println("Error");
    }
    
    }

    static void modificarLista() throws IOException{
    crearArchivo();
    for(Aprobacion r:estudiantes){
      agregarArchivo(r);
    }
    }
    public  static void crearArchivo() throws IOException{
       File file=new File("Estudiantes.txt");
        FileWriter fw=new FileWriter(file,true);
    }
}
