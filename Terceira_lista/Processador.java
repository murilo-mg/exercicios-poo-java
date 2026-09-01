/*
 * Questão 1: Classe Processador
 * Crie a classe Processador com atributos marca, modelo, velocidade (double) e numNucleos (int).
 * Implemente encadeamento de construtores (vazio e parametrizado) e os métodos:
 * - getVelocidadeParalela(): velocidade * numNucleos
 * - getDescricao(): retorna String formatada com os dados e velocidade paralela em GHz.
 */

public class Processador {
    public String marca;
    public String modelo;
    public double velocidade;
    public int numNucleos;

    public Processador() {
        this("", "", 0.0, 0);
    }

    public Processador(String marca, String modelo, double velocidade, int numNucleos) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.numNucleos = numNucleos;
    }

    public double getVelocidadeParalela() {
        return this.velocidade * this.numNucleos;
    }

    public String getDescricao() {
        return String.format("Processador: marca=%s, modelo=%s, velocidade=%.1fGHz, numNucleos=%d, velocidadeParalela=%.1fGHz.",
                this.marca, this.modelo, this.velocidade, this.numNucleos, getVelocidadeParalela());
    }
}