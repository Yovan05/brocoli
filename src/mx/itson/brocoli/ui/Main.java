
package mx.itson.brocoli.ui;

import java.util.Scanner;
import mx.itson.brocoli.negocio.Operacion;


public class Main {
    
    public static void main(String[] args) {
        
        
        System.out.println("Escriba el texo a separar");
        
        Scanner leer = new Scanner (System.in);
        
        String oracion = leer.nextLine();
        
        String [] resultado = new Operacion().separar(oracion);
        
        
        for(String r : resultado){
            System.out.println(r);
        }
        
    }
    
    
    
}
