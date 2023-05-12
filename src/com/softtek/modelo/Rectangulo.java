package com.softtek.modelo;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(int coordenadaX, int coordenadaY, double ancho, double alto) {
        super(coordenadaX, coordenadaY);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String posicion() {
        return "Rectángulo en " + super.posicion() + " con ancho " + ancho + " y alto " + alto;
    }
}

