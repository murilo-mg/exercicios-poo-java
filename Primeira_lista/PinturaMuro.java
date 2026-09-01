/*
 * Pintura do Muro
 * 
 * Mário precisa pintar um muro, que tem 12m de comprimento e 3m de altura. 
 * O material de pintura (galão de tinta, lixa, rolo, etc.) custa R$100. 
 * Cada pintor cobra um preço diferente por m² pelo serviço de pintura. 
 * Escreva uma classe chamada PinturaMuro em Java que, dado o valor cobrado 
 * por um pintor (R$/m²), informe o custo total da pintura (com uma casa decimal).
 * 
 * Exemplo de Entrada: 3,2
 * Exemplo de Saída: 215,2
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