/*
 * Questão 22: Volume de Combustível
 * Lê H (altura total do tanque), h (nível de combustível) e r (raio das semiesferas).
 * Calcula o volume de combustível em litros (multiplicado por 1000) considerando as 3 partes do tanque:
 * 1. Semiesfera inferior (0 <= h <= r)
 * 2. Cilindro central (r < h <= H - r)
 * 3. Semiesfera superior (H - r < h <= H)
 * Exibe a saída em litros com 3 casas decimais ou -1.000 para dados inválidos.
 * 
 * Exemplo de Entrada: 50 40 10  ->  Saída: 11519,173
 */

import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double H = scanner.nextDouble();
        double h = scanner.nextDouble();
        double r = scanner.nextDouble();

        // Validação das entradas
        if (H <= 0 || h < 0 || r <= 0 || h > H || 2 * r > H) {
            System.out.printf("%.3f\n", -1.000);
            scanner.close();
            return;
        }

        double volumeM3 = 0.0;

        if (h <= r) {
            // Apenas na calota esférica da semiesfera inferior
            volumeM3 = (Math.PI / 3.0) * Math.pow(h, 2) * (3 * r - h);
        } else if (h <= H - r) {
            // Semiesfera inferior completa + parte do cilindro
            double volumeSemiesferaInferior = (2.0 / 3.0) * Math.PI * Math.pow(r, 3);
            double alturaCilindroPreenchido = h - r;
            double volumeCilindro = Math.PI * Math.pow(r, 2) * alturaCilindroPreenchido;

            volumeM3 = volumeSemiesferaInferior + volumeCilindro;
        } else {
            // Semiesfera inferior completa + cilindro completo + calota da semiesfera superior
            double volumeSemiesferaInferior = (2.0 / 3.0) * Math.PI * Math.pow(r, 3);
            double alturaCilindroTotal = H - 2 * r;
            double volumeCilindro = Math.PI * Math.pow(r, 2) * alturaCilindroTotal;

            // Altura do ar na calota superior
            double alturaAr = H - h;
            double volumeCalotaAr = (Math.PI / 3.0) * Math.pow(alturaAr, 2) * (3 * r - alturaAr);
            double volumeSemiesferaSuperior = (2.0 / 3.0) * Math.PI * Math.pow(r, 3);
            double volumeSemiesferaSuperiorPreenchida = volumeSemiesferaSuperior - volumeCalotaAr;

            volumeM3 = volumeSemiesferaInferior + volumeCilindro + volumeSemiesferaSuperiorPreenchida;
        }

        // Converte de m³ para Litros (1 m³ = 1000 Litros)
        double volumeLitros = volumeM3 * 1000.0;

        System.out.printf("%.3f\n", volumeLitros);

        scanner.close();
    }
}