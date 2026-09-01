/*
 * Questão 3: Classe Disco
 * Crie a classe Disco com atributos marca, tipo, capacidade (double) e rpm (int).
 * Implemente encadeamento de construtores e o método:
 * - getDescricao(): retorna String formatada com os dados do disco (capacidade em GB e rotação em rpm).
 */

public class Disco {
    public String marca;
    public String tipo;
    public double capacidade;
    public int rpm;

    public Disco() {
        this("", "", 0.0, 0);
    }

    public Disco(String marca, String tipo, double capacidade, int rpm) {
        this.marca = marca;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.rpm = rpm;
    }

    public String getDescricao() {
        return String.format("Disco: marca=%s, tipo=%s, capacidade=%.1fGB, rpm=%drpm.",
                this.marca, this.tipo, this.capacidade, this.rpm);
    }
}