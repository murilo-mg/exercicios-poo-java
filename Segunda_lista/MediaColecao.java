/*
 * Média de uma Coleção
 * Lê uma sequência de inteiros terminada por -1 e calcula a média com 2 casas decimais.
 * 
 * Exemplo de Entrada: 5 3 9 3 1 -1
 * Exemplo de Saída: 4,20
 */

import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidade = 0;

        int valor = scanner.nextInt();
        while (valor != -1) {
            soma += valor;
            quantidade++;
            valor = scanner.nextInt();
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.printf("%.2f\n", media);
        }

        scanner.close();
    }
}