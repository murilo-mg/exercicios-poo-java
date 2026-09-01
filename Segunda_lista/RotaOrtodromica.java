/*
 * Rota Ortodrômica
 * Leia latitude e longitude em graus de dois pontos e calcule a distância ortodrômica em km.
 * Fórmula: d = 6371 * acos(sin(t1)*sin(t2) + cos(t1)*cos(t2)*cos(g1 - g2))
 * 
 * Exemplo de Entrada: 28,485867 -80,544439 -3,088144 -59,964330
 * Exemplo de Saída: 
 * A distancia entre os pontos (28,485867, -80,544439) e (-3,088144, -59,964330) e de 4142,52 km
 */

import java.util.Scanner;

public class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lat1Deg = scanner.nextDouble();
        double lon1Deg = scanner.nextDouble();
        double lat2Deg = scanner.nextDouble();
        double lon2Deg = scanner.nextDouble();

        double t1 = Math.toRadians(lat1Deg);
        double g1 = Math.toRadians(lon1Deg);
        double t2 = Math.toRadians(lat2Deg);
        double g2 = Math.toRadians(lon2Deg);

        double r = 6371.0;
        double d = r * Math.acos(Math.sin(t1) * Math.sin(t2) + Math.cos(t1) * Math.cos(t2) * Math.cos(g1 - g2));

        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km\n",
                lat1Deg, lon1Deg, lat2Deg, lon2Deg, d);

        scanner.close();
    }
}