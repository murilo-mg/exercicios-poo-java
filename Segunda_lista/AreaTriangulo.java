/*
 * Área do Triângulo
 * Leia os lados a, b, c e calcule a área do triângulo via Fórmula de Heron (com 2 casas decimais).
 */

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Triangulo invalido");
        } else {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("%.2f\n", area);
        }
        
        scanner.close();
    }
}