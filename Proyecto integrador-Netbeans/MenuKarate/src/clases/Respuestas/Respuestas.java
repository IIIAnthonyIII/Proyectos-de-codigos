package clases.Respuestas;

import java.util.StringTokenizer;

public class Respuestas {
 String[] respuestas = {
        "KARA significa vacío y TE mano",
        "Alerta continua",
        "Mirada",
        "El aprovechamiento de la energía física y mental en el momento del impacto",
        "Energía interior",
        "La liberación de la energía interna mediante un grito",
        "Saludo",
        "El saludo (REI) se hace por cortesía para demostrar respeto humildad y gentileza",
        "Combate",
        "JODAN"
    };
    
    String[] radioR = {
        "KARA significa vacío y TE mano,Alerta continua,Mirada,Energía interior",
        "Alerta continua,Saludo,Combate,Mirada",
        "Mirada,Alerta continua,Saludo,Combate",
        "El aprovechamiento de la energía física y mental en el momento del impacto,Energía interior,Mirada,Saludo", 
        "Energía interior,La liberación de la energía interna mediante un grito,Saludo,Mirada", 
        "La liberación de la energía interna mediante un grito,Saludo,Combate,Mirada",
        "Saludo,Mirada,Combate,Alerta continua",
        "El saludo (REI) se hace por cortesía para demostrar respeto humildad y gentileza,Por costumbre,Por formalidad,Combate",
        "Combate,Saludo,Alerta continua,MIrada",  
        "JODAN,CHUDAN,GEDAN,Ninguno",
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
