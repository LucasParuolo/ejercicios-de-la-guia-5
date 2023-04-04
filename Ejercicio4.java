
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // Realizar un programa que rellene un matriz de 4 x 4 de 
        //valores aleatorios y muestre la traspuesta de la matriz. 
        //La matriz traspuesta de una matriz A se denota por B y 
        //se obtiene cambiando sus filas por columnas (o viceversa).
        Scanner leer = new Scanner(System.in);
        int [][] matrizA  = new int[4][4];
        
        for(int i = 0; i < 4 ; i++){
           for(int j = 0; j < 4; j++){
              matrizA[i][j] = (int) (Math.random()*100+1);
              
           }
        }
        for(int o = 0; o < 4 ; o++){
           for(int j = 0;  j< 4; j++){
               System.out.print(matrizA[o][j] + " ");
              
           }
            System.out.println(" ");
        }
        int [][] matrizB = new int [4][4];
           
        System.out.println(" ");
        
        for(int e = 0; e < 4 ; e++){
           for(int j = 0; j < 4; j++){
              matrizB[e][j] = matrizA[j][e];
              
           }   
        }
        
        for(int u = 0; u < 4 ; u++){
           for(int j = 0;  j< 4; j++){
               System.out.print(matrizB[u][j] + " ");
              
           }
            System.out.println(" ");
        }
    }
}
