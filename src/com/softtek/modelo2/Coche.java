package com.softtek.modelo2;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
    @Override
    public void frenar() {
        System.out.println("El coche está frenando.");
    }
    public void abrirPuertas() {
        System.out.println("El coche está abriendo las puertas.");
    }
}
