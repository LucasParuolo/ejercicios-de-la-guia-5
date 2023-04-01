
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que llene un vector de tamaño N 
        //con valores aleatorios y le pida al usuario un número a buscar en el 
        //vector. El programa mostrará dónde se encuentra el numero y si se 
        //encuentra repetido
        Scanner leer = new Scanner(System.in);
        
        int vector[] = new int[100];
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * 100+1);
            //System.out.println(vector[i]);
        }
        
        
        System.out.println("ingrese un numero a buscar");
        int numero = leer.nextInt();
        int cont = 0;
        
        for (int i = 0; i < vector.length; i++){
            if (numero == vector[i]){
                System.out.println("El numero " + numero + " fue hallado en la posicion " + i);
                
                cont += 1;
            }
            
        }
        if (cont == 0){
                    System.out.println("No se ha encontrado ningun numero ¡DE 100!");
                }
    }

   
    
}
