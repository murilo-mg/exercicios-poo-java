/*
 * Idade UFAM
 * Leia o ano atual do teclado e imprima a idade da UFAM (fundada em 1909).
 */

import java.util.Scanner;

public class IdadeUfam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = scanner.nextInt();
        int idade = anoAtual - 1909;
        
        System.out.println("A UFAM tem " + idade + " anos de fundacao");
        scanner.close();
    }
}