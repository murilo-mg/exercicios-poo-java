/*
 * Questão 40: Fração Contínua: Raiz Quadrada de Dois
 * Escreva um programa (classe RaizDois) que leia um número N do teclado e determine
 * o valor de sqrt(2) através da sua expansão em fração contínua com N termos.
 * Semente utilizada = 1.0. Exibe os resultados intermediários com 14 casas decimais de precisão.
 * 
 * Exemplo de Entrada 1: 1 -> Saída: 1,33333333333333
 * Exemplo de Entrada 2: 2 -> Saída: 1,33333333333333
 *                                  1,42857142857143
 */

import java.util.Scanner;

public class RaizDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        double valorAcumulado = 1.0; // Semente inicial = 1

        for (int i = 1; i <= n; i++) {
            // A parte cíclica expande adicionando uma camada de 1 / (2 + semente)
            valorAcumulado = 1.0 / (2.0 + valorAcumulado);
            
            // O valor da aproximação final é 1 + parte cíclica
            double aproximacao = 1.0 + valorAcumulado;
            
            System.out.printf("%.14f\n", aproximacao);
        }

        scanner.close();
    }
}