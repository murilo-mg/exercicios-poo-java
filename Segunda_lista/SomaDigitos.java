/*
 * Soma dos Dígitos
 * Leia um número inteiro e exiba a soma de todos os seus dígitos.
 * 
 * Exemplo de Entrada: 3141
 * Exemplo de Saída: 9
 */

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = Math.abs(scanner.nextInt());
        int soma = 0;

        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println(soma);
        scanner.close();
    }
}