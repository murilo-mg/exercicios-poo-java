/*
 * Operações em Números Inteiros
 * Lê vetores de inteiros terminados em -1 e imprime:
 * Qtd elementos, Qtd pares, Qtd ímpares, Soma, Média (2 cas. dec.), Maior, Menor.
 * Termina o programa quando um vetor sem elementos for fornecido.
 * 
 * Exemplo de Entrada: 1 5 2 8 4 -1 10 54 23 78 -1 -1
 */

import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int valor = scanner.nextInt();

            if (valor == -1) {
                break;
            }

            int quantidade = 0;
            int pares = 0;
            int impares = 0;
            int soma = 0;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            while (valor != -1) {
                quantidade++;
                soma += valor;

                if (valor % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;

                valor = scanner.nextInt();
            }

            double media = (double) soma / quantidade;

            System.out.println(quantidade);
            System.out.println(pares);
            System.out.println(impares);
            System.out.println(soma);
            System.out.printf("%.2f\n", media);
            System.out.println(maior);
            System.out.println(menor);
        }

        scanner.close();
    }
}