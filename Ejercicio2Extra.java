
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
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que averigüe si dos vectores de N enteros son iguales
        //(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el tamaño de los vectores");
        int n = leer.nextInt();
        int [] vec1 = new int [n];
        int [] vec2 = new int [n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Escriba un numero para el vector 1");
            vec1[i] = leer.nextInt();
        }
        
        for (int i = 0; i < n; i++){
            System.out.println("Escriba un numero para el vector 2");
            vec2[i] = leer.nextInt();
        }
        
        int cont = 0;
        
        for (int i = 0; i < n; i++){
            if (vec1[i] == vec2[i]){
                cont += 1;
                
            }else{
                System.out.println("Los dos vectores son distintos");
                break;
            }
        }
        
        if (cont == n){
            System.out.println("Los dos Vectores son iguales");
        }
    }
    
}
