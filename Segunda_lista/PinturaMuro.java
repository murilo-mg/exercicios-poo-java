/*
 * Pintura do Muro
 * Dado o preço cobrado por m² (muro de 12m x 3m + R$100 de material), informe o custo total.
 */

import java.util.Scanner;

public class PinturaMuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoPorMetro = scanner.nextDouble();
        
        double area = 12 * 3;
        double custoTotal = (area * precoPorMetro) + 100;
        
        System.out.printf("%.1f\n", custoTotal);
        scanner.close();
    }
}