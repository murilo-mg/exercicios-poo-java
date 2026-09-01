/*
 * Porcentagem de Acerto
 * Lê as respostas do candidato terminando com -1 e o gabarito terminando com -1.
 * Exibe a porcentagem de acerto com 2 casas decimais.
 * 
 * Exemplo de Entrada: 1 2 3 4 5 -1 1 2 3 1 1 -1
 * Exemplo de Saída: 60,00
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> respostas = new ArrayList<>();
        ArrayList<Integer> gabarito = new ArrayList<>();

        // Leitura das respostas
        int valor = scanner.nextInt();
        while (valor != -1) {
            respostas.add(valor);
            valor = scanner.nextInt();
        }

        // Leitura do gabarito
        valor = scanner.nextInt();
        while (valor != -1) {
            gabarito.add(valor);
            valor = scanner.nextInt();
        }

        int acertos = 0;
        int totalQuestoes = respostas.size();

        for (int i = 0; i < totalQuestoes; i++) {
            if (respostas.get(i).equals(gabarito.get(i))) {
                acertos++;
            }
        }

        double porcentagem = ((double) acertos / totalQuestoes) * 100.0;
        System.out.printf("%.2f\n", porcentagem);

        scanner.close();
    }
}