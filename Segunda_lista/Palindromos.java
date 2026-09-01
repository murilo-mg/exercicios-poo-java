/*
 * Palíndromos
 * Leia uma frase, exiba-a em maiúsculas e sem espaços, informando se é palíndromo (1) ou não (0).
 * 
 * Exemplo de Entrada: A Rara Arara
 * Exemplo de Saída: ARARAARARA 1
 */

import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        String textoLimpo = texto.toUpperCase().replace(" ", "");

        boolean ehPalindromo = true;
        int n = textoLimpo.length();

        for (int i = 0; i < n / 2; i++) {
            if (textoLimpo.charAt(i) != textoLimpo.charAt(n - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        System.out.printf("%s %d\n", textoLimpo, ehPalindromo ? 1 : 0);

        scanner.close();
    }
}