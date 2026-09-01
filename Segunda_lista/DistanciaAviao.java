/*
 * Distância Percorrida pelo Avião
 * Lê um circuito de cidades (usando códigos 111, 222, 333, etc.) até a entrada -1.
 * Utiliza a matriz fixa de tempos de voo para calcular o tempo total do percurso.
 * 
 * Exemplo de Entrada: 222 444 333 555 -1
 * Exemplo de Saída: 31
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DistanciaAviao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] tabela = {
            {0, 2, 11, 6, 15, 11, 1},
            {2, 0, 7, 12, 4, 2, 15},
            {11, 7, 0, 11, 8, 3, 13},
            {6, 12, 11, 0, 10, 2, 1},
            {15, 4, 8, 10, 0, 5, 13},
            {11, 2, 3, 2, 5, 0, 14},
            {1, 15, 13, 1, 13, 14, 0}
        };

        ArrayList<Integer> circuito = new ArrayList<>();
        int cidade = scanner.nextInt();
        while (cidade != -1) {
            circuito.add(cidade);
            cidade = scanner.nextInt();
        }

        int tempoTotal = 0;

        for (int i = 0; i < circuito.size() - 1; i++) {
            int origemIdx = getIndex(circuito.get(i));
            int destinoIdx = getIndex(circuito.get(i + 1));

            tempoTotal += tabela[origemIdx][destinoIdx];
        }

        System.out.println(tempoTotal);

        scanner.close();
    }

    private static int getIndex(int codigoCidade) {
        switch (codigoCidade) {
            case 111: return 0;
            case 222: return 1;
            case 333: return 2;
            case 444: return 3;
            case 555: return 4;
            case 666: return 5;
            case 777: return 6;
            default: return -1;
        }
    }
}