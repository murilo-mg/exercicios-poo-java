/*
 * Aproximação de Pi (Série Nilakantha)
 * Lê k termos e exibe cada passo da aproximação de Pi com 6 casas decimais.
 * Fórmula: Pi = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8) - ...
 * 
 * Exemplo de Entrada: 2
 * Exemplo de Saída:
 * 3,000000
 * 3,166667
 */

import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        double pi = 3.0;
        System.out.printf("%.6f\n", pi);

        for (int i = 1; i < k; i++) {
            double n = 2 * i;
            double termo = 4.0 / (n * (n + 1) * (n + 2));

            if (i % 2 != 0) {
                pi += termo;
            } else {
                pi -= termo;
            }

            System.out.printf("%.6f\n", pi);
        }

        scanner.close();
    }
}