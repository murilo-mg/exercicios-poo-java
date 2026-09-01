/*
 * Tanque de Combustível
 * Lê o raio do tanque (r), a altura do ar (h) e a opção (1 = volume de ar, 2 = volume de combustível).
 * Usa as fórmulas do volume da esfera e da calota esférica para exibir o resultado com 4 casas decimais.
 * 
 * Exemplo de Entrada 1: 30 27 1  ->  Saída: 48094,6419
 * Exemplo de Entrada 2: 30 27 2  ->  Saída: 65002,6936
 */

import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        double h = scanner.nextDouble();
        int opcao = scanner.nextInt();

        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double volumeCalota = (Math.PI / 3.0) * Math.pow(h, 2) * (3 * r - h);

        if (opcao == 1) {
            System.out.printf("%.4f\n", volumeCalota);
        } else if (opcao == 2) {
            double volumeCombustivel = volumeEsfera - volumeCalota;
            System.out.printf("%.4f\n", volumeCombustivel);
        }

        scanner.close();
    }
}