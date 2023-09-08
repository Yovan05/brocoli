
package mx.itson.brocoli.negocio;

/**
 * Contiene métodos para trabajar con tipo de datos String.
 * @author Yovan
 */


public class Operacion {
    
    /**
     * Separa una cadena de texto a partir de la expresión guion medio "-".
     * @param valor Cadena de texto que será separada a partir de la expresión dada.
     * @return Array de String en donde cada posición representa una división de la cadena de texto.
     */
   public String[] separar (String valor){
       
       
       
       String[] elementos =valor.split("-");
   
       return elementos;
   
   }
   
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
}
