/*
 * Aproximação do Seno (Série de Maclaurin/Taylor)
 * Lê o ângulo em graus e o número k de termos. Exibe o valor acumulado termo a termo com 10 casas decimais.
 * Fórmula: sin(x) = x - x^3/3! + x^5/5! - x^7/7! + ...
 * 
 * Exemplo de Entrada: 45 2
 * Exemplo de Saída:
 * 0,7853981634
 * 0,7046526512
 */

import java.util.Scanner;

public class AproximacaoSeno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double graus = scanner.nextDouble();
        int k = scanner.nextInt();

        double x = Math.toRadians(graus);
        double seno = 0.0;

        for (int i = 0; i < k; i++) {
            int expoente = 2 * i + 1;
            
            // Cálculo incremental do fatorial
            double fatorial = 1.0;
            for (int j = 1; j <= expoente; j++) {
                fatorial *= j;
            }

            double termo = Math.pow(x, expoente) / fatorial;

            if (i % 2 == 0) {
                seno += termo;
            } else {
                seno -= termo;
            }

            System.out.printf("%.10f\n", seno);
        }

        scanner.close();
    }
}