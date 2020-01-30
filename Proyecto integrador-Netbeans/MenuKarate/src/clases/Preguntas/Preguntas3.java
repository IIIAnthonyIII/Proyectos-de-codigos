
package clases.Preguntas;


public class Preguntas3 {
    String[] preguntas = {
       "¿Cuál es el tipo de respiración normal?",
       "¿Cuál es el tipo de respiración profunda?", 
       "¿Cuál es el tipo de respiración diafragmática con contracción abdominal sonora?", 
       "¿Cuál es el tipo de respiración diafragmática con contracción abdominal sin ruido?",
       "¿Cuál es el tipo de diafragmática sin contracción abdominal?",
       "¿Qué tipo de kumite es asalto libre?",
       "¿Qué tipo de kumite es asalto reglamentado?",
       "¿Cuál es el asalto libre a una técnica?",
       "¿Cuál es la función que realiza GOHON KUMITE?",
       "¿Cuál es la función que realiza SANBON KUMITE?"
    };
     
  
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }    
}
