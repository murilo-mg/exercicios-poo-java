/*
 * Soma de uma Coleção
 * Lê inteiros do teclado até encontrar -1 e exibe a soma de todos os números lidos.
 * 
 * Exemplo de Entrada: 1 2 3 4 -1
 * Exemplo de Saída: 10
 */

import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int valor = scanner.nextInt();

        while (valor != -1) {
            soma += valor;
            valor = scanner.nextInt();
        }

        System.out.println(soma);
        scanner.close();
    }
}