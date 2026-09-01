/*
 * Cifra de César
 * Leia o valor do deslocamento e o texto. Criptografe e exiba o texto em MAIÚSCULAS.
 * Mantém caracteres não alfabéticos inalterados.
 * 
 * Exemplo de Entrada: 12 it's an older code, sir, but it checks out
 * Exemplo de Saída: UF'E MZ AXPQD OAPQ, EUD, NGF UF OTQOWE AGF
 */

import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int deslocamento = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após o número
        String texto = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                int posOriginal = c - 'a';
                int posCifrada = (posOriginal + deslocamento) % 26;
                char cCifrado = (char) ('A' + posCifrada);
                resultado.append(cCifrado);
            } else {
                resultado.append(c);
            }
        }

        System.out.println(resultado.toString());

        scanner.close();
    }
}