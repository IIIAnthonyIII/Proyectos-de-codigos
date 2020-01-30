
package clases.Respuestas;

import java.util.StringTokenizer;


public class Respuestas3 {
    
     String[] respuestas = {
         "DONTO",
     "IBUKI SANKAI",
     "IBUKI",
     "IBUKI NOGARE",
     "NOGARE",
     "JYU KUMITE",
     "SIHAI KUMITE",
     "JYJU IPPON KUMITE",
     "Asalto a cinco pasos o cinco técnicas",
     "Asalto a tres pasos o tres técnicas",


    };
     String[] radioR = {
        "DONTO,IBUKI,IBUKI,NOGARE",
        "IBUKI SANKAI,IBUKI,IBUKI NOGARE,NOGARE ",
        "IBUKI,DONTO,IBUKI NOGARE,NOGARE ",
        "IBUKI NOGARE,NOGARE,IBUKI,DONTO",
        "NOGARE,IBUKI SANKAI,IBUKI,DONTO",
        "JYU KUMITE,YAKUSOKU KUMITE,JYJU IPPON KUMITE,SIHAI KUMITE",
        "SIHAI KUMITE,YAKUSOKU KUMITE,JYJU IPPON KUMITE,JYU KUMITE",
        "JYJU IPPON KUMITE,YAKUSOKU KUMITE,JYU KUMITE,SIHAI KUMITE",
        "Asalto a cinco pasos o cinco técnicas,Asalto a un paso o una técnica,Asalto a tres pasos o tres técnicas,Asalto de estudio convencional entrelazado",
        "Asalto a tres pasos o tres técnicas,Asalto a cinco pasos o cinco técnicas,Asalto de estudio convencional entrelazado,Asalto libre a una técnica"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
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
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
