
package clases.Preguntas;


public class Preguntas {
    
    String[] preguntas = {
        "¿Qué significa KARATE? ",
        "¿Qué significa ZANSHIN? ",
        "¿Qué significa CHAKUGAN? ", 
        "¿Qué es KIME? ",
        "¿Qué es KI? ",
        "¿Qué es KIAI?",
        "¿Qué significa REI? ",
        "¿Por qué se saluda y cuál es la finalidad del saludo? ",
        "Significado de la palabra KUMITE:",
        "¿Cual es el nivel alto para golpear?"
    };
     
  
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }    
    
}
