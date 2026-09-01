/*
 * Questão 4: Classe Computador
 * Crie a classe Computador associando fabricante (String) e os objetos Processador, Memoria e Disco.
 * Implemente o construtor parametrizado e o método:
 * - getDescricao(): combina a descrição do fabricante com os métodos getDescricao() dos componentes.
 */

public class Computador {
    public String fabricante;
    public Processador processador;
    public Memoria memoria;
    public Disco disco;

    public Computador(String fabricante, Processador processador, Memoria memoria, Disco disco) {
        this.fabricante = fabricante;
        this.processador = processador;
        this.memoria = memoria;
        this.disco = disco;
    }

    public String getDescricao() {
        return String.format("Computador da fabricante %s. %s %s %s",
                this.fabricante,
                this.processador.getDescricao(),
                this.memoria.getDescricao(),
                this.disco.getDescricao());
    }
}