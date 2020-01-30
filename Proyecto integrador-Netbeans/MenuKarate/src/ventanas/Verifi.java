
package ventanas;

import java.io.IOException;

/**
 *
 * @author wesle
 */
public class Verifi {
    
    
      public  static int nivelAprobado;
  public static String ced;
     Verifi (int nivelAprobado,String ced) throws IOException{
      Verifi.nivelAprobado= nivelAprobado;
      Verifi.ced=ced;
        if(nivelAprobado==1 ){
          CinturonNegro i = new CinturonNegro();
        i.setVisible(true);
    
      }
      if(nivelAprobado==2 ){
          PrimerDAN e = new PrimerDAN();
        e.setVisible(true);
    
      }
        if(nivelAprobado==3){
        SegundoDAN a = new SegundoDAN();
        a.setVisible(true);
       
        }
        if (nivelAprobado==4){
       TercerDAN b = new TercerDAN();
        b.setVisible(true);
     
        }
      }
        
}
