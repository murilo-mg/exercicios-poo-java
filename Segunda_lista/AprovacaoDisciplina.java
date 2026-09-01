/*
 * Aprovação em Disciplina
 * Lê vetor de notas (double), vetor de horas de presença (int) e carga horária total (int).
 * Exibe: Aprovados, Reprovados por nota, Reprovados por frequência (< 75% da carga horária).
 * 
 * Exemplo de Entrada: 10,0 10,0 9,0 -1 44 45 46 -1 60
 * Exemplo de Saída: 2 0 1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Integer> presencas = new ArrayList<>();

        double nota = scanner.nextDouble();
        while (nota != -1) {
            notas.add(nota);
            nota = scanner.nextDouble();
        }

        int presenca = scanner.nextInt();
        while (presenca != -1) {
            presencas.add(presenca);
            presenca = scanner.nextInt();
        }

        int cargaHoraria = scanner.nextInt();

        int aprovados = 0;
        int reprovadosNota = 0;
        int reprovadosFrequencia = 0;

        double frequenciaMinima = cargaHoraria * 0.75;

        for (int i = 0; i < notas.size(); i++) {
            double n = notas.get(i);
            int p = presencas.get(i);

            if (p < frequenciaMinima) {
                reprovadosFrequencia++;
            } else if (n < 5.0) {
                reprovadosNota++;
            } else {
                aprovados++;
            }
        }

        System.out.printf("%d %d %d\n", aprovados, reprovadosNota, reprovadosFrequencia);

        scanner.close();
    }
}