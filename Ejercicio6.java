
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                do {
                    System.out.println("Ingrese un numero de 1 al 9");

                    matriz[i][j] = leer.nextInt();

                } while ((matriz[i][j] < 1) && (matriz[i][j] > 9));
            }
        }

        for (int[] fila : matriz) {

            for (int elemento : fila) {

                System.out.print("[" + elemento + "]");

            }
            System.out.println("");
        }
        int[] suma = new int[8];
        int contador = 0;
        int aux;

        for (int i = 0; i < 3; i++) {

            aux = 0;

            for (int j = 0; j < 3; j++) {

                aux = aux + matriz[i][j];

            }
            suma[contador] = aux;
            contador++;
        }

        for (int j = 0; j < 3; j++) {

            aux = 0;

            for (int i = 0; i < 3; i++) {

                aux = aux + matriz[i][j];
            }
            suma[contador] = aux;
            contador++;
        }

        suma[contador] = matriz[0][0] + matriz[1][1] + matriz[2][2];

        contador++;
        suma[contador] = matriz[0][2] + matriz[1][1] + matriz[2][0];
        
       /* for (int i = 0; i < 8; i++) {

            System.out.print("[" + suma[i] + "]");

        }
*/
        contador = 0;

        for (int i = 0; i < 8; i++) {

            if (suma[i] != suma[0]) {

                System.out.println("No es magica");
                break;
            } else {
                contador++;
            }

            if (contador == 8) {

                System.out.println("Es magica");
            }

        }

    }
    }
