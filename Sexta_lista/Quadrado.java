package br.edu.icomp.ufam.lab_heranca;

/**
 * Exercício 4: Classe Quadrado
 * Cria um quadrado como especialização de Retangulo, utilizando o mesmo valor
 * para largura e altura e sobrescrevendo sua representação textual.
 */
public class Quadrado extends Retangulo {

    public Quadrado(int posX, int posY, double lado) {
        super(posX, posY, lado, lado);
    }

    @Override
    public String toString() {
        return "Quadrado na " + getPosString()
                + " com lado de " + getLargura() + "cm"
                + " (área=" + getArea() + "cm2, perímetro=" + getPerimetro() + "cm)";
    }
}
