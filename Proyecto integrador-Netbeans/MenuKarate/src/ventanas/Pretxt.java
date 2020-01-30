
package ventanas;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class Pretxt {
    String numpre;
    
    String pre;
     String opc11;
     String opc22;
     String opc33;
     String opc44;
     
     String reC;

    public String getReC() {
        return reC;
    }

    public void setReC(String reC) {
        this.reC = reC;
    }

    public String getNumpre() {
        return numpre;
    }

    public void setNumpre(String numpre) {
        this.numpre = numpre;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getOpc11() {
        return opc11;
    }

    public void setOpc11(String opc11) {
        this.opc11 = opc11;
    }

    public String getOpc22() {
        return opc22;
    }

    public void setOpc22(String opc22) {
        this.opc22 = opc22;
    }

    public String getOpc33() {
        return opc33;
    }

    public void setOpc33(String opc33) {
        this.opc33 = opc33;
    }

    public String getOpc44() {
        return opc44;
    }

    public void setOpc44(String opc44) {
        this.opc44 = opc44;
    }
     
     
   
    
    public void crea(Pretxt o,String dir,String dir2,String dir3) throws IOException{
    
    File crear =new File(dir);
    File crear2=new File(dir2);
    File crear3=new File(dir3);
      FileWriter flwriter = null;
      FileWriter flwriter2 = null;
      FileWriter flwriter3 = null;
    if(!(crear.exists() && crear2.exists()&& crear3.exists()) ){
        crear.createNewFile();
        crear2.createNewFile();
        crear3.createNewFile();
    flwriter = new FileWriter(crear,true);
    flwriter2 = new FileWriter(crear2,true);
    flwriter3 = new FileWriter(crear3,true);
    
    BufferedWriter bw = new BufferedWriter(flwriter);
    BufferedWriter bw2 = new BufferedWriter(flwriter2);
    BufferedWriter bw3 = new BufferedWriter(flwriter3);
    bw.write("Pregunta:"+o.getPre()+",");
    bw.close();
    bw2.write(o.getOpc11()+","+o.getOpc22()+","+o.getOpc33()+","+o.getOpc44()+"-");
    bw2.close();
    bw3.write(o.getReC()+",");
    bw3.close();
    
    
    flwriter.close();
    flwriter2.close();
    flwriter3.close();
    
    }
    else{
        
     flwriter = new FileWriter(crear,true);
    flwriter2 = new FileWriter(crear2,true);
    flwriter3 = new FileWriter(crear3,true);
    
    BufferedWriter bw = new BufferedWriter(flwriter);
    BufferedWriter bw2 = new BufferedWriter(flwriter2);
    BufferedWriter bw3 = new BufferedWriter(flwriter3);
    bw.write("Pregunta:"+o.getPre()+",");
    bw.close();
    bw2.write(o.getOpc11()+","+o.getOpc22()+","+o.getOpc33()+","+o.getOpc44()+"-");
    bw2.close();
    bw3.write(o.getReC()+",");
    bw3.close();
    
    
    flwriter.close();
    flwriter2.close();
    flwriter3.close();
 }
            
    }       
        
                        
/*
            public String Escoger(){
             JFileChooser busca= new JFileChooser();
              busca.showOpenDialog(busca);
              String lineas=new String();
                try{
                    
              String path= busca.getSelectedFile().getAbsolutePath();
              FileInputStream ar= new FileInputStream(path);
              
              DataInputStream ent= new DataInputStream(ar);
              
              BufferedReader buff= new BufferedReader(new InputStreamReader(ent));
              
               
          while((lineas=buff.readLine())!=null){
                    //System.out.println(lineas);
              }
              ent.close();
            
            }catch(Exception e){
            System.out.println("Error");
            }
            
            return lineas;
            }

            
           
            public String EscogerR(){
             JFileChooser busca= new JFileChooser();
              busca.showOpenDialog(busca);
              String lineas2=new String();
                try{
              String path= busca.getSelectedFile().getAbsolutePath();
              FileInputStream ar= new FileInputStream(path);
              
              DataInputStream ent= new DataInputStream(ar);
              
              BufferedReader buff= new BufferedReader(new InputStreamReader(ent));
              
              
            while((lineas2=buff.readLine())!=null){
             // System.out.println(lineas2);
            }
              ent.close();
            
            }catch(Exception e){
            System.out.println("Error");
            }
            
            return lineas2;
            }

     */       
            
          
}
/*String []preguntas= new String[10];

public String[] leer2Archivo() throws IOException{
    File file= new File("E:\\Preguntas.txt");
     Pretxt o;
    
         try (Scanner sca = new Scanner(file)) {
             o = new Pretxt();
             
             while(sca.hasNextLine()){
                 String line = sca.nextLine();
                 Scanner delimit = new Scanner(line);
                 delimit.useDelimiter("\\s*,\\s*");
               for(int i=0; i<10; i++) {
                preguntas[i]=(delimit.next());
                
             }   
             } sca.close();   }
         
    return preguntas;
    } 
    public String[] separar(String cadena, String separador){ //"5,6,7,8"
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    

public void TO(){

 for(int i=0; i<10; i++) {
               System.out.println( preguntas[i]);
                
             }
}
public static void main(String []a ) throws IOException{
Pretxt ot=new Pretxt();  
ot.leer2Archivo();
  ot.TO();
  
}*/

/*private void leerActionPerformed(java.awt.event.ActionEvent evt) {                                     
          @SuppressWarnings("UnusedAssignment")
        Cine.Pelicula est = new Cine().new Pelicula();
        Cine.OperacionesArchivo ar=new Cine().new OperacionesArchivo();
        Cine.Productora est1= new Cine().new Productora();
          
        try {
            est=ar.leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Cineventana.class.getName()).log(Level.SEVERE, null, ex);
        ciudad.setText(est1.getCiudad());
        nombre.setText(est1.getNom());
        direccion.setText(est1.getDireccion());
        
        }
        try {
            est1=ar.leer2Archivo();
        } catch (IOException ex) {
            Logger.getLogger(Cineventana.class.getName()).log(Level.SEVERE, null, ex);
       nombrepel.setText(est.getNombre());
        actorPrin.setText(est.getActorPrincipal());
        oscar.setText(est.getOscar());
        }
     
       
       
        
    } */