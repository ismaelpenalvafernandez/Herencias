package com.softtek.modelo2;

public class Tren extends Vehiculo {
    private int numVagones;

    public Tren(String marca, String modelo, int numVagones) {
        super(marca, modelo);
        this.numVagones = numVagones;
    }
    @Override
    public void acelerar() {
        System.out.println("El tren está acelerando.");
    }
    @Override
    public void frenar() {
        System.out.println("El tren está frenando.");
    }
    public void cargarPasajeros() {
        System.out.println("El tren está cargando pasajeros.");
    }
}