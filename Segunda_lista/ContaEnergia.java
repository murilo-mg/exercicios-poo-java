/*
 * Conta de Energia
 * Leia o consumo (em kWh) e o tipo de instalação ('R', 'C' ou 'I').
 * Calcule o valor total da conta com base na tabela da faixa de consumo (exibindo 2 casas decimais).
 * Exibe -1.00 para entradas com valores negativos ou tipos inválidos.
 */

import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consumo = scanner.nextDouble();
        char tipo = scanner.next().toUpperCase().charAt(0);

        if (consumo < 0) {
            System.out.printf("%.2f\n", -1.00);
            scanner.close();
            return;
        }

        double precoKwh = -1.0;

        if (tipo == 'R') {
            precoKwh = (consumo <= 500) ? 0.40 : 0.65;
        } else if (tipo == 'C') {
            precoKwh = (consumo <= 1000) ? 0.55 : 0.60;
        } else if (tipo == 'I') {
            precoKwh = (consumo <= 5000) ? 0.55 : 0.60;
        }

        if (precoKwh < 0) {
            System.out.printf("%.2f\n", -1.00);
        } else {
            double total = consumo * precoKwh;
            System.out.printf("%.2f\n", total);
        }

        scanner.close();
    }
}