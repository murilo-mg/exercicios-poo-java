package br.edu.ufam.icomp.lab_encapsulamento;

/**
 * Exercício 6: Classe GISMain
 * Demonstra polimorfismo por meio de um vetor de objetos Localizavel,
 * armazenando celulares e carros luxuosos e exibindo suas posições.
 */
public class GISMain {
    public static void main(String[] args) {
        Localizavel[] vetorLocalizaveis = new Localizavel[4];

        vetorLocalizaveis[0] = new Celular(55, 92, 999999999);
        vetorLocalizaveis[1] = new Celular(55, 92, 888888888);
        vetorLocalizaveis[2] = new CarroLuxuoso("ABC-1234");
        vetorLocalizaveis[3] = new CarroLuxuoso("XYZ-5678");

        for (int i = 0; i < vetorLocalizaveis.length; i++) {
            System.out.println(vetorLocalizaveis[i].getPosicao());
        }
    }
}
