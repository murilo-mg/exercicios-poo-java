package br.edu.icomp.ufam.lab_heranca;

/**
 * Exercício 1: Classe FormaGeometrica
 * Cria uma classe abstrata para representar uma forma geométrica com posição
 * no plano e métodos abstratos para calcular área e perímetro.
 */
public abstract class FormaGeometrica {

    public int posX;
    public int posY;

    public FormaGeometrica(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public String getPosString() {
        return "posição (" + posX + ", " + posY + ")";
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public abstract double getArea();

    public abstract double getPerimetro();
}
