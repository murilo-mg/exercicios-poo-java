package br.edu.icomp.ufam.lab_heranca;

/**
 * Exercício 2: Classe Circulo
 * Implementa uma forma geométrica circular, calculando área e perímetro
 * a partir do raio e sobrescrevendo sua representação textual.
 */
public class Circulo extends FormaGeometrica {

    public double raio;

    public Circulo(int posX, int posY, double raio) {
        super(posX, posY);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Círculo na " + getPosString()
                + " com raio de " + raio + "cm"
                + " (área=" + getArea() + "cm2, perímetro=" + getPerimetro() + "cm)";
    }
}
