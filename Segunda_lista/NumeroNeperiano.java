/*
 * Aproximação do Número e (Série de Taylor)
 * Lê k e calcula a soma dos k primeiros termos da série: e = 1/0! + 1/1! + 1/2! + ...
 * Imprime com 6 casas decimais.
 * 
 * Exemplo de Entrada: 3
 * Exemplo de Saída: 2,500000
 */

import java.util.Scanner;

public class NumeroNeperiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        double e = 0.0;
        double fatorial = 1.0;

        for (int i = 0; i < k; i++) {
            if (i > 0) {
                fatorial *= i;
            }
            e += 1.0 / fatorial;
        }

        System.out.printf("%.6f\n", e);
        scanner.close();
    }
}