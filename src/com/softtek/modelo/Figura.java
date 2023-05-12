package com.softtek.modelo;

public class Figura {
    private int coordenadaX;
    private int coordenadaY;

    public Figura(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String posicion() {
        return "(" + coordenadaX + ", " + coordenadaY + ")";
    }
}