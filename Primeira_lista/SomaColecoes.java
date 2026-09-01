/*
 * Soma de Várias Coleções
 * 
 * Escreva um programa (classe SomaColecoes) que calcula a soma de várias 
 * coleções de valores digitados pelo usuário. O usuário irá inserir -1 para 
 * indicar o fim de uma coleção e o início da próxima. Uma coleção sem elementos 
 * (isto é, dois -1 seguidos) indica o final do programa.
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
            int primeiroValor = scanner.nextInt();
            
            if (primeiroValor == -1) {
                break;
            }
            
            int soma = primeiroValor;
            while (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                if (valor == -1) {
                    break;
                }
                soma += valor;
            }
            
            System.out.println(soma);
        }
        
        scanner.close();
    }
}