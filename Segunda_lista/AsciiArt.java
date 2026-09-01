/*
 * ASCII Art
 * 
 * Escreva um programa (classe AsciiArt) que imprima uma figura semelhante 
 * à representada abaixo, a partir da leitura do número de asteriscos 
 * presentes na base. Por exemplo, para uma entrada igual a 5:
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 */

import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int asteriscos = n - i;
            int espacos = i * 2;
            
            for (int j = 0; j < asteriscos; j++) {
                System.out.print('*');
            }
            
            for (int j = 0; j < espacos; j++) {
                System.out.print(' ');
            }
            
            for (int j = 0; j < asteriscos; j++) {
                System.out.print('*');
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}