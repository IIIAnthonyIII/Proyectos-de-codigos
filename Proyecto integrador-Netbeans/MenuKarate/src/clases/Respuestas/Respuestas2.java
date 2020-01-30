
package clases.Respuestas;

import java.util.StringTokenizer;

public class Respuestas2 {
      String[] respuestas2 = {
        "KARA significa vacío TE significa mano y DO camino espiritual",
        "ZENPO",
        "JYUN KAITEN",
        "SOKUMEN (YOKO)",
        "HAIWAN o UDE",
        "KENTOS",
        "NAKADAKA IPPON KEN",
        "URAKEN",
        "KEITO",
        "DE ASHI-HIKI ASHI",
};
     String[] radioR = {
        "KARA significa vacío TE significa mano y DO camino espiritual,KARA significa vacío; TE significa mano y DO brazos,KARA significa vacío; TE significa mano y DO piernas,KARA significa vacío; TE significa mano y DO corazon",
        "ZENPO,JYUN KAITEN,GYAKU KAITEN,KOHO",
        "JYUN KAITEN,ZENPO,GYAKU KAITEN,KOHO ",
        "SOKUMEN (YOKO),SHOMEN (MAE),HANMI,GYAKU HANMI ",
        "HAIWAN o UDE,EMPI o HIJI,SEIKEN,URAKEN",
        "KENTOS,SHUTO,HAITO,HAISU",
        "NAKADAKA IPPON KEN,TEISHO o SHOTEI,NAKADAKA KEN,KEITO ",
        "URAKEN,TEISHO o SHOTEI,NAKADAKA KEN,KEITO",    
        "KEITO,HAITO,KENTOS,HAISU",
        "DE ASHI-HIKI ASHI,YOKO ASHI-MAWARI ASHI,TOBI ASHI-YORI ASHI,YORI ASHI-YOKO ASHI",
    };
   public String getRespuesta(int posicion){
        return respuestas2[posicion];
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

    public String[] setRespuestas1(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}