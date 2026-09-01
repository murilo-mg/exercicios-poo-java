/*
 * Time de Futebol
 * Lê dois vetores (gols marcados e gols sofridos) terminados por -1.
 * Exibe em uma linha: número de vitórias, empates e derrotas.
 * 
 * Exemplo de Entrada: 4 0 2 3 1 3 -1 0 0 2 5 1 2 -1
 * Exemplo de Saída: 2 3 1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> marcados = new ArrayList<>();
        ArrayList<Integer> sofridos = new ArrayList<>();

        int valor = scanner.nextInt();
        while (valor != -1) {
            marcados.add(valor);
            valor = scanner.nextInt();
        }

        valor = scanner.nextInt();
        while (valor != -1) {
            sofridos.add(valor);
            valor = scanner.nextInt();
        }

        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;

        for (int i = 0; i < marcados.size(); i++) {
            int gMarcados = marcados.get(i);
            int gSofridos = sofridos.get(i);

            if (gMarcados > gSofridos) {
                vitorias++;
            } else if (gMarcados == gSofridos) {
                empates++;
            } else {
                derrotas++;
            }
        }

        System.out.printf("%d %d %d\n", vitorias, empates, derrotas);

        scanner.close();
    }
}