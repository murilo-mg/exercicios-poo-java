package br.edu.ufam.icomp.lab_encapsulamento;

/**
 * Exercício 4: Classe Carro
 * Representa um carro com placa protegida e métodos públicos
 * para consultar e alterar seu valor.
 */
public class Carro {
    protected String placa;

    public Carro(String placa) {
        this.placa = placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}
