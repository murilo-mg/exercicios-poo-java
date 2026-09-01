/*
 * Mediana de uma Coleção
 * Lê um vetor de inteiros já ordenados terminado em -1 e imprime a mediana com 1 casa decimal.
 * 
 * Exemplo de Entrada 1: 2 4 5 7 9 12 15 -1  ->  Saída: 7,0
 * Exemplo de Entrada 2: 4 7 16 25 32 45 -1   ->  Saída: 20,5
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int valor = scanner.nextInt();
        while (valor != -1) {
            numeros.add(valor);
            valor = scanner.nextInt();
        }

        int n = numeros.size();
        double mediana;

        if (n % 2 != 0) {
            mediana = numeros.get(n / 2);
        } else {
            mediana = (numeros.get((n / 2) - 1) + numeros.get(n / 2)) / 2.0;
        }

        System.out.printf("%.1f\n", mediana);

        scanner.close();
    }
}