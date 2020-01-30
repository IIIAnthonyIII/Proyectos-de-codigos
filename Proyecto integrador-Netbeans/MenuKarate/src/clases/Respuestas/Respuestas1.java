
package clases.Respuestas;

import java.util.StringTokenizer;

public class Respuestas1 {
     String[] respuestas1 = {
     "TSUKITE",
     "KOSHI KAITEN",
     "KAKAE KOMI ASHI",
     "JIKU ASHI",
     "KEAGE ",
     "RITSU REI ",
     "SENSEINI REI ",
     "Para relajarnos de la tensión mantenida",
     "Para desarrollar los elementos fundamentales del KARATE",
     "KI",


    };
     String[] radioR = {
        "TSUKITE,HIKITE,KOSHI KAITEN,kAKAE KOMI ASHI",
        "KOSHI KAITEN,kAKAE KOMI ASHI,TSUKITE,HIKITEKOSHI KAITEN",
        "KAKAE KOMI ASHI,KERI HANASHI,JIKU ASHI,KOSHI",
        "JIKU ASHI,KAKAE KOMI ASHI,KERI HANASHI,KOSHI",
        "KEAGE,KEBANASHI,KEKOMI,FUMIKOMI",
        "RITSU REI,OTAGAINI REI,SENSEINI REI,SOMENI REI",
        "SENSEINI REI,RITSU REI,OTAGAINI REI,SOMENI REI",
        "Para relajarnos de la tensión mantenida,Para base las tecnicas de pierna,Para las tecnicas de brazo,Para el saludo de ceremonia",
        "Para desarrollar los elementos fundamentales del KARATE,Para subir de Dan,Para la elevacion de rodilla,Para la ejecucion de brazo",
        "KI,CHAKUGAN ,HYOSHI ,ZANSHIN"
    };
   public String getRespuesta(int posicion){
        return respuestas1[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[9];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
      public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
}
  
    

