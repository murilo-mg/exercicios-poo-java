/*
 * Dia da Semana
 * Lê uma matriz N x 7 com horas trabalhadas de domingo (1) a sábado (7), terminada por -1.
 * Calcula e exibe o(s) dia(s) da semana com maior soma total de horas trabalhadas.
 * 
 * Exemplo de Entrada: 2 4 3 4 5 8 8 7 3 4 3 3 4 4 3 3 4 3 3 2 2 9 3 4 7 3 4 1 -1
 * Exemplo de Saída: 1
 */

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] somaDias = new int[7];

        while (scanner.hasNextInt()) {
            int valor = scanner.nextInt();
            if (valor == -1) {
                break;
            }

            somaDias[0] += valor;
            for (int j = 1; j < 7; j++) {
                somaDias[j] += scanner.nextInt();
            }
        }

        int maiorSoma = Integer.MIN_VALUE;
        for (int i = 0; i < 7; i++) {
            if (somaDias[i] > maiorSoma) {
                maiorSoma = somaDias[i];
            }
        }

        for (int i = 0; i < 7; i++) {
            if (somaDias[i] == maiorSoma) {
                System.out.println(i + 1);
            }
        }

        scanner.close();
    }
}