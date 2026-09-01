/*
 * Desconto
 * Lê o preço sem desconto. Se for R$200.00 ou mais, aplica 5% de desconto.
 * 
 * Exemplo de Entrada: 320,99
 * Exemplo de Saída: 304,94
 */

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor >= 200.0) {
            valor *= 0.95;
        }

        System.out.printf("%.2f\n", valor);

        scanner.close();
    }
}