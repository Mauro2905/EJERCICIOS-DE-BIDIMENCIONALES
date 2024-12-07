package matriz;

import java.util.Scanner;
import java.util.Random;
public class llaves {
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

        int c = (d + 1) / 2; 
        System.out.print("Elije un anillo a sumar, de 1 a " + c + " : ");
        int anillo = p.nextInt();

        if (anillo <= c && anillo > 0) {
            int suma = 0;
            int in = anillo - 1;
            int fi = d - anillo;

            if (in == fi) { 
                suma = matriz[in][in];
            } else {
                for (int j = in; j <= fi; j++) {
                    suma += matriz[in][j];
                }
                for (int j = in; j <= fi; j++) {
                    suma += matriz[fi][j];
                }
                for (int i = in + 1; i < fi; i++) {
                    suma += matriz[i][in];
                }
                for (int i = in + 1; i < fi; i++) {
                    suma += matriz[i][fi];
                }
            }

            System.out.println("La suma del anillo elegido es: " + suma);
        } else {
            System.out.println("El anillo ingresado no es valido");
        }
        p.close();
    }
}



