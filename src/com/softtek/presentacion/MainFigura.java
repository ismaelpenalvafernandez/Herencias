package com.softtek.presentacion;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Circulo;
import com.softtek.modelo.Rectangulo;
public class MainFigura {
    public static void main(String[] args) {
        // Crear objetos de las tres clases
        Figura figura = new Figura(4, 6);
        Circulo circulo = new Circulo(4, 8, 10);
        Rectangulo rectangulo = new Rectangulo(4, 8, 8, 10);

        // Mostrar la posición de cada figura
        System.out.println("Posición de la Figura: " + figura.posicion());
        System.out.println("Posición del Círculo: " + circulo.posicion());
        System.out.println("Posición del Rectángulo: " + rectangulo.posicion());
    }
}

