/*
 * Raiz Quadrada
 * Calcule e imprima a raiz quadrada de um número inteiro lido do teclado com 4 casas decimais.
 */

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        
        double raiz = Math.sqrt(numero);
        System.out.printf("%.4f\n", raiz);
        
        scanner.close();
    }
}