package br.edu.ufam.icomp.lab_encapsulamento;

/**
 * Exercício 1: Classe Posicao
 * Representa uma posição geográfica por latitude, longitude e altitude,
 * utilizando atributos privados, getters, setters e representação textual.
 */
public class Posicao {
    private double latitude;
    private double longitude;
    private double altitude;

    public Posicao(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    @Override
    public String toString() {
        return "Posição: " + latitude + ", " + longitude + ", " + altitude;
    }
}
