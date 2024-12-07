package matriz;

import java.util.Scanner;
import java.util.Random;
public class rotar {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        Random r = new Random();

        System.out.print("INGRESE LA DIMENSION DE LA MATRIZ: ");
        int d = p.nextInt();

        int[][] matriz = new int[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                matriz[i][j] = r.nextInt(20) + 1;
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        int[][] rotada = new int[d][d];
 
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                rotada[j][d - 1 - i] = matriz[i][j];
            }
        }

        System.out.println("Matriz rotada:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("%4d", rotada[i][j]);
            }
            System.out.println();
        }
    }
}

