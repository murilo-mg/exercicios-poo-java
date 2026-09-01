/*
 * Ponto e Reta
 * Verifica se um ponto (x, y) pertence à reta 2x + y = 3.
 * 
 * Exemplo de Entrada 1: 0,5 2,0  ->  Ponto (0,5, 2,0) pertence a reta 2x + y = 3.
 * Exemplo de Entrada 2: 6,0 3,8  ->  Ponto (6,0, 3,8) nao pertence a reta 2x + y = 3.
 */

import java.util.Scanner;

public class PontoReta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double resultado = 2 * x + y;

        // Tolerância pequena para lidar com imprecisão de double
        if (Math.abs(resultado - 3.0) < 0.00001) {
            System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.\n", x, y);
        } else {
            System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.\n", x, y);
        }

        scanner.close();
    }
}