/*
 * Tipo do Triangulo
 * Leia os 3 lados de um triângulo e imprima seu tipo ("equilatero", "isosceles" ou "escaleno").
 * Imprima "invalido" caso algum lado seja <= 0 ou se a condição de existência de um triângulo falhar.
 */

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("invalido");
        } else if (a == b && b == c) {
            System.out.println("equilatero");
        } else if (a == b || a == c || b == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("escaleno");
        }

        scanner.close();
    }
}