
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa que compruebe si una matriz dada es antisimétrica. 
        //Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
        //propia traspuesta, pero cambiada de signo. 
        //Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una 
        //matriz A se denota por AT y se obtiene cambiando sus filas por 
        //columnas (o viceversa).
        Scanner leer = new Scanner(System.in);
        int [][] matrizA = new int [3][3];
        int [][] matrizB = new int [3][3];
        
        for(int i = 0; i < 3 ; i++){
           for(int j = 0; j < 3; j++){
              matrizA[i][j] = leer.nextInt();
           }
        }
        
        for(int e = 0; e < 3; e++){
          for(int j = 0; j < 3; j++){
           matrizB[e][j] = (matrizA[j][e]);
           } 
        }
          
          for(int u = 0; u < 3 ; u++){
           for(int j = 0;  j< 3; j++){
               System.out.print(matrizB[u][j] + " ");
              
           }
            System.out.println(" ");
          }
            
        int cont = 0;
                
          for(int a = 0; a < 3; a++){
              for(int e = 0; e < 3; e++){
                  if (matrizA[a][e] == (matrizB[a][e] * -1)){
                     cont += 1; 
                  }
              }
          }
          
        if (cont == 9){
            System.out.println("La matriz A es una matriz antisimetrica");
        }else{
            System.out.println("La matriz A no es una matriz antisimetrica");
        }
    
    
}
}
