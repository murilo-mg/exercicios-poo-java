package br.edu.ufam.icomp.lab_encapsulamento;

/**
 * Exercício 2: Interface Localizavel
 * Define os métodos necessários para objetos capazes de informar
 * sua posição geográfica e o erro de localização.
 */
public interface Localizavel {
    Posicao getPosicao();
    double getErroLocalizacao();
}
