package br.edu.icomp.ufam.lab_heranca;

/**
 * Exercício 3: Classe Retangulo
 * Implementa uma forma geométrica retangular com largura e altura,
 * calculando área, perímetro e sua representação textual.
 */
public class Retangulo extends FormaGeometrica {

    public double largura;
    public double altura;

    public Retangulo(int posX, int posY, double largura, double altura) {
        super(posX, posY);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return largura * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return "Retângulo na " + getPosString()
                + " com largura de " + largura + "cm e altura de " + altura + "cm"
                + " (área=" + getArea() + "cm2, perímetro=" + getPerimetro() + "cm)";
    }
}
