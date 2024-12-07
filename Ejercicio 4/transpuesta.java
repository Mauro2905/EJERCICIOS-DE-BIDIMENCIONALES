package matriz;

import java.util.Scanner;
import java.util.Random;
public class transpuesta {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        Random r = new Random();

        System.out.println("INGRESE LA DIMENSION DE LA MATRIZ");
        System.out.print("Ingrese cantidad de filas: ");
        int a = p.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int b = p.nextInt();

        int[][] matriz = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matriz[i][j] = r.nextInt(20) + 1;
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        
        int[][] transpuesta = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("%4d", transpuesta[i][j]);
            }
            System.out.println();
        }
        p.close();
    }
}

