/*
 * Caixa Eletrônico
 * Calcule o menor número de notas (R$50, R$10, R$2) para um valor de saque par e positivo.
 */

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        
        if (valor <= 0 || valor % 2 != 0) {
            System.out.println("Valor Invalido");
        } else {
            int notas50 = valor / 50;
            valor %= 50;
            
            int notas10 = valor / 10;
            valor %= 10;
            
            int notas2 = valor / 2;
            
            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2\n", 
                              notas50, notas10, notas2);
        }
        scanner.close();
    }
}