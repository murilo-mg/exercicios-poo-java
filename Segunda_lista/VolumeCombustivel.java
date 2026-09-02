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

import java.util.Locale;
import java.util.Scanner;

public class VolumeCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        if (!scanner.hasNextDouble()) {
            System.out.printf(Locale.US, "%.3f\n", -1.000);
            return;
        }
        double H = scanner.nextDouble();
        double h = scanner.nextDouble();
        double R = scanner.nextDouble();

        if (R <= 0 || H <= 0 || h < 0 || H < 2 * R || h > H) {
            System.out.printf(Locale.US, "%.3f\n", -1.000);
            return;
        }

        double volume = 0.0;
        double hcil = H - 2 * R;

        if (h <= R) {
            volume = (Math.PI * Math.pow(h, 2) / 3.0) * (3 * R - h);
        } else if (h <= R + hcil) {
            double volSemiesferaInferior = (2.0 / 3.0) * Math.PI * Math.pow(R, 3);
            double alturaCilindroPreenchida = h - R;
            double volCilindro = Math.PI * Math.pow(R, 2) * alturaCilindroPreenchida;
            volume = volSemiesferaInferior + volCilindro;
        } else {
            double volSemiesferaInferior = (2.0 / 3.0) * Math.PI * Math.pow(R, 3);
            double volCilindroCompleto = Math.PI * Math.pow(R, 2) * hcil;
            double hCalotaSuperior = h - (R + hcil);
            double volCalotaSuperior = (Math.PI * Math.pow(hCalotaSuperior, 2) / 3.0) * (3 * R - hCalotaSuperior);
            volume = volSemiesferaInferior + volCilindroCompleto + volCalotaSuperior;
        }

        System.out.printf(Locale.US, "%.3f\n", volume);

        scanner.close();
    }
}
