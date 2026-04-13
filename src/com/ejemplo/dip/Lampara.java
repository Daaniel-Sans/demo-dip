package com.ejemplo.dip;

public class Lampara {
    // La lámpara ya no sabe "qué" hay al otro lado, solo conoce la interfaz
    private final FuenteEnergia fuente;

    // Inyección de dependencias por constructor
    public Lampara(FuenteEnergia fuente) {
        this.fuente = fuente;
    }

    public void encender() {
        fuente.suministrar();
        System.out.println("Lámpara Con DIP: ¡Encendida con éxito y desacoplada!");
    }
}