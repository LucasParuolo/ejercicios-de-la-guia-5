
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
public class Ejercicio3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una función rellene un vector con números aleatorios, 
        //pasándole un arreglo por parámetro. 
        //Después haremos otra función o procedimiento que imprima el vector.
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        
        Relleno(vector, n);
        Impresora(vector, n);
    }
    
    public static void Relleno(int[] vector, int n){
        for (int i = 0; i < n; i++){
           vector[i] =  (int) (Math.random()*10+1);
        }
        
    }
    
    public static void Impresora(int [] vector, int n){
        for (int i = 0; i < n; i++){
            System.out.print("[" + vector[i] + "] ");
           
        }
       
    }
}
