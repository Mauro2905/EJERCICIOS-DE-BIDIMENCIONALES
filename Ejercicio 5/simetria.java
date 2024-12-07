package matriz;

import java.util.Scanner;

public class simetria {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("INGRESE LA DIMENSION DE LA MATRIZ: ");
        int d = p.nextInt();

        int[][] matriz = new int[d][d];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print("Ingrese el valor del indice [" + i + "]" + "[" + j + "] :");
                matriz[i][j] = p.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        boolean esSimetrica = true;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
            if (!esSimetrica) {
                break;
            }
        }

        if (esSimetrica) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }
}

