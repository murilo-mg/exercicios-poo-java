/**
 * Exercício 1: Classe Sala
 * Representa uma sala de aula com bloco, número, capacidade e acessibilidade.
 * Implementa construtores encadeados e uma descrição formatada da sala.
 */
public class Sala {
    public int bloco;
    public int sala;
    public int capacidade;
    public boolean acessivel;

    public Sala() {
        this(0, 0, 0, false);
    }

    public Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    public String getDescricao() {
        return "Bloco " + bloco + ", Sala " + sala + " (" + capacidade + " lugares, "
                + (acessivel ? "acessível" : "não acessível") + ")";
    }
}