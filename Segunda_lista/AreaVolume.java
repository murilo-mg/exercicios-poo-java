/*
 * Área do Círculo, Volume da Esfera
 * Leia o raio (double) e exiba a área do círculo (PI * r²) e o volume da esfera (4/3 * PI * r³).
 * 
 * Exemplo de Entrada: 45
 * Exemplo de Saída:
 * Um circulo com raio de 45,00 centimetros tem uma area de 6361,73 centimetros quadrados.
 * Uma esfera com raio de 45,00 centimetros tem um volume de 381703,51 centimetros cubicos.
 */

import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double area = Math.PI * Math.pow(r, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", r, area);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n", r, volume);

        scanner.close();
    }
}