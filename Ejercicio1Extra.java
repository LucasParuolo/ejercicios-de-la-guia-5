
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
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();

        int[] vector = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {

            System.out.println(" Ingrese el valor " + i + " del vector");

            vector[i] = leer.nextInt();
            suma += vector[i];
        }

        System.out.println("La suma de los elementos ingresados es :" + suma);

    }
    }
