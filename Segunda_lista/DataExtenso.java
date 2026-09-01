/*
 * Data por Extenso
 * Leia uma data no formato "ddmmaaaa" e imprima a data por extenso.
 * 
 * Exemplo de Entrada: 21102015
 * Exemplo de Saída: 21 de outubro de 2015
 */

import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();

        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(2, 4));
        int ano = Integer.parseInt(data.substring(4, 8));

        String[] meses = {
            "", "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        System.out.printf("%d de %s de %d\n", dia, meses[mes], ano);

        scanner.close();
    }
}