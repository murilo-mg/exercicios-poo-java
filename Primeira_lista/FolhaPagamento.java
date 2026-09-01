/*
 * Folha de Pagamento
 * 
 * Fernando Silva é programador e ganha por horas trabalhadas. Sabendo que 
 * são descontados 11% para o Imposto de Renda e 8% para o INSS. Escreva uma 
 * classe chamada FolhaPagamento que receba o valor da hora (double) e 
 * quantidade de horas (int) trabalhadas de Fernando e calcule:
 * - Qual o salário bruto?
 * - Quanto Fernando pagou de Imposto de Renda?
 * - Quanto Fernando pagou ao INSS?
 * - Qual o total de descontos do salário de Fernando?
 * - Qual é o salário líquido de Fernando?
 * 
 * Exemplo de Entrada: 50 40
 * Exemplo de Saída:
 * Salario bruto: R$2000,00
 * IR: R$220,00
 * INSS: R$160,00
 * Total de descontos: R$380,00
 * Salario liquido: R$1620,00
 */

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorHora = scanner.nextDouble();
        int horasTrabalhadas = scanner.nextInt();
        
        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.printf("Salario bruto: R$%.2f\n", salarioBruto);
        System.out.printf("IR: R$%.2f\n", ir);
        System.out.printf("INSS: R$%.2f\n", inss);
        System.out.printf("Total de descontos: R$%.2f\n", totalDescontos);
        System.out.printf("Salario liquido: R$%.2f\n", salarioLiquido);
        
        scanner.close();
    }
}