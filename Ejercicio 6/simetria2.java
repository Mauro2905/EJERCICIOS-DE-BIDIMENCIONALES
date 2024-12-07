package matriz;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class simetria2 {
    public static void main(String[] args){
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
  
        List<Integer> recorridoEspiral = recorrer(matriz);
        System.out.println("Recorrido en espiral:");
        System.out.println(recorridoEspiral);
        
    }
    
    public static List<Integer> recorrer(int[][] matriz) {
        List<Integer> resultado = new ArrayList<>();
        if (matriz == null || matriz.length == 0) {
            return resultado;
        }

        int filaInicio = 0, filaFin = matriz.length - 1;
        int columnaInicio = 0, columnaFin = matriz[0].length - 1;

        while (filaInicio <= filaFin && columnaInicio <= columnaFin) {
            for (int j = columnaInicio; j <= columnaFin; j++) {
                resultado.add(matriz[filaInicio][j]);
            }
            filaInicio++;

            for (int i = filaInicio; i <= filaFin; i++) {
                resultado.add(matriz[i][columnaFin]);
            }
            columnaFin--;

            if (filaInicio <= filaFin) {
                for (int j = columnaFin; j >= columnaInicio; j--) {
                    resultado.add(matriz[filaFin][j]);
                }
                filaFin--;
            }

            if (columnaInicio <= columnaFin) {
                for (int i = filaFin; i >= filaInicio; i--) {
                    resultado.add(matriz[i][columnaInicio]);
                }
                columnaInicio++;
            }
        }
        return resultado;
    }
}
