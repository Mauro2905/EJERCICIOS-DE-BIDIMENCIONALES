package matriz;

import java.util.Scanner;
import java.util.Random;
public class suma_diagonal {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("INGRESE LA DIMENSION DE LA MATRIZ: ");
        int d = p.nextInt();

        int[][] matriz = new int[d][d];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                matriz[i][j] = r.nextInt(1, 21);
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        int sum = 0, j = 0, sum2 = 0, z = 0;
        
        for (int i = 0; i < d; i++) {
            sum += matriz[i][j];
            j++;
        }
        
        for (int i = d - 1; i >= 0; i--) {
            sum2 += matriz[i][z];
            z++;
        }
        
        System.out.println("La suma de la diagonal principal es:" + sum);
        System.out.println("La suma de la diagonal secundaria es:" + sum2);
    }
}
