package com.softtek.modelo2;

public class Barcos extends Vehiculo {
    private int  numeroPuertas;

    public Barcos(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public void acelerar() {
        System.out.println("El barco está acelerando.");
    }
    @Override
    public void frenar() {
        System.out.println("El barco está frenando.");
    }
    public void navegar() {
        System.out.println("El barco está navegando.");
    }
}
