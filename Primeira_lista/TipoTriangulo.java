/*
 * Tipo do Triangulo
 * 
 * Escreva um programa (classe TipoTriangulo) que leia as medidas dos três 
 * lados de um triângulo, fornecidas pelo usuário, em qualquer ordem, e imprima 
 * o nome do tipo de triângulo: "equilatero", "isosceles", ou "escaleno".
 * Se pelo menos um dos lados for negativo/zero ou os três lados não formarem 
 * um triângulo, imprima a mensagem "invalido".
 */

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("invalido");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
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