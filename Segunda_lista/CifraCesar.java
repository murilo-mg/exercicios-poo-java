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
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNextInt()) {
            scan.close();
            return;
        }

        int deslocamento = scan.nextInt();

        String textoOriginal = scan.nextLine();
        
        if (textoOriginal.isEmpty() && scan.hasNextLine()) {
            textoOriginal = scan.nextLine();
        } else if (textoOriginal.startsWith(" ")) {
            textoOriginal = textoOriginal.substring(1);
        }

        StringBuilder textoCifrado = new StringBuilder();

        for (int i = 0; i < textoOriginal.length(); i++) {
            char cOriginal = textoOriginal.charAt(i);

            if (cOriginal >= 'a' && cOriginal <= 'z') {
                char cCifrado = (char) (cOriginal - 'a');
                cCifrado = (char) ((cCifrado + deslocamento) % 26);
                cCifrado += 'A';
                textoCifrado.append(cCifrado);
            } 
            else if (cOriginal >= 'A' && cOriginal <= 'Z') {
                char cCifrado = (char) (cOriginal - 'A');
                cCifrado = (char) ((cCifrado + deslocamento) % 26);
                cCifrado += 'A';
                textoCifrado.append(cCifrado);
            } 
            else {
                textoCifrado.append(cOriginal);
            }
        }

        System.out.println(textoCifrado.toString());
        scan.close();
    }
}
