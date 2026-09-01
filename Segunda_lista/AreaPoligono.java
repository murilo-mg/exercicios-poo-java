/*
 * Questão 30: Área do Polígono
 * Lê dois vetores de coordenadas (x e y) terminados em -1 e calcula a área do polígono
 * utilizando a fórmula do laço do sapateiro (Shoelace formula).
 * Exibe a área calculada com 4 casas decimais de precisão.
 * 
 * Exemplo de Entrada 1: 4 4 7 7 9 7 4 -1 0 7.5 7.5 3 0 0 0 -1  ->  Saída: 25,5000
 * Exemplo de Entrada 2: 4 9 11 2 4 -1 10 7 2 2 10 -1          ->  Saída: 45,5000
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> x = new ArrayList<>();
        ArrayList<Double> y = new ArrayList<>();

        // Leitura do vetor das abscissas (X)
        double valor = scanner.nextDouble();
        while (valor != -1) {
            x.add(valor);
            valor = scanner.nextDouble();
        }

        // Leitura do vetor das ordenadas (Y)
        valor = scanner.nextDouble();
        while (valor != -1) {
            y.add(valor);
            valor = scanner.nextDouble();
        }

        int n = x.size(); // Quantidade de pontos (incluindo o ponto repetido no final)
        double soma = 0.0;

        // Somatório da fórmula de i = 0 até n - 2
        for (int i = 0; i <= n - 2; i++) {
            soma += (x.get(i + 1) + x.get(i)) * (y.get(i + 1) - y.get(i));
        }

        // Aplicação do módulo e divisão por 2.0
        double area = 0.5 * Math.abs(soma);

        System.out.printf("%.4f\n", area);

        scanner.close();
    }
}