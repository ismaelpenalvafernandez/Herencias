package com.softtek.presentacion;
import com.softtek.modelo2.Vehiculo;
import com.softtek.modelo2.Avion;
import com.softtek.modelo2.Barcos;
import com.softtek.modelo2.Coche;
import com.softtek.modelo2.Tren;

public class MainVehiculos {
    public static void main(String[] args) {
        Avion Avion = new Avion("Caza", "RWT4", 2);
        Barcos Barcos = new Barcos("QW34", "Transatlántico", 4);
        Tren Tren = new Tren("Renfe", "AVE", 10);
        Coche Coche = new Coche("Audi", "RS5", 2);

        Coche.mostrarInformacion();
        Coche.acelerar();
        Coche.frenar();
        Coche.abrirPuertas();
        System.out.println();

        Barcos.mostrarInformacion();
        Barcos.acelerar();
        Barcos.frenar();
        Barcos.navegar();
        System.out.println();

        Avion.mostrarInformacion();
        Avion.acelerar();
        Avion.frenar();
        Avion.despegar();
        System.out.println();

        Tren.mostrarInformacion();
        Tren.acelerar();
        Tren.frenar();
        Tren.cargarPasajeros();
    }
}


