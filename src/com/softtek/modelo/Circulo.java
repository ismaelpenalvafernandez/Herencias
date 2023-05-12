package com.softtek.modelo;

public class Circulo extends Figura {
    private double radio;

    public Circulo(int coordenadaX, int coordenadaY, double radio) {
        super(coordenadaX, coordenadaY);
        this.radio = radio;
    }

    @Override
    public String posicion() {
        return "Círculo en " + super.posicion() + " con radio " + radio;
    }
}
