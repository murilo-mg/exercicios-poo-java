/*
 * Questão 2: Classe Memoria
 * Crie a classe Memoria com marca, tipo, tamanho (double), velocidade (double) e numPentes (int).
 * Implemente encadeamento de construtores e os métodos:
 * - getTamanhoTotal(): tamanho * numPentes
 * - getVelocidadeParalela(): velocidade * numPentes
 * - getDescricao(): retorna String formatada com os dados, tamanhoTotal (GB) e velocidadeParalela (GHz).
 */

public class Memoria {
    public String marca;
    public String tipo;
    public double tamanho;
    public double velocidade;
    public int numPentes;

    public Memoria() {
        this("", "", 0.0, 0.0, 0);
    }

    public Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.numPentes = numPentes;
    }

    public double getTamanhoTotal() {
        return this.tamanho * this.numPentes;
    }

    public double getVelocidadeParalela() {
        return this.velocidade * this.numPentes;
    }

    public String getDescricao() {
        return String.format("Memoria: marca=%s, tipo=%s, tamanho=%.1fGB, velocidade=%.1fGHz, numPentes=%d, tamanhoTotal=%.1fGB, velocidadeParalela=%.1fGHz.",
                this.marca, this.tipo, this.tamanho, this.velocidade, this.numPentes, getTamanhoTotal(), getVelocidadeParalela());
    }
}