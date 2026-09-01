/*
 * Soma de Várias Coleções
 * Lê coleções de números inteiros terminadas por -1 e exibe a soma de cada coleção.
 * Duas entradas -1 seguidas indicam o fim do programa.
 * 
 * Exemplo de Entrada: 20 30 40 -1 8 7 64 -1 38 26 15 95 -1 -1
 * Exemplo de Saída:
 * 90
 * 79
 * 174
 */

import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int valor = scanner.nextInt();

            if (valor == -1) {
                break;
            }

            int soma = 0;
            while (valor != -1) {
                soma += valor;
                valor = scanner.nextInt();
            }

            System.out.println(soma);
        }

        scanner.close();
    }
}