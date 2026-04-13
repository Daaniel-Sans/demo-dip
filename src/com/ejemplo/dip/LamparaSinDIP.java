package com.ejemplo.dip;

// Alto Nivel: Lógica de negocio acoplada
public class LamparaSinDIP {
    // ERROR: Dependencia directa de una clase concreta (Bajo Nivel)
    private ConexionParedSinDIP conexion = new ConexionParedSinDIP();

    public void encender() {
        conexion.suministrar();
        System.out.println("Lámpara Sin DIP: Encendida (pero es inflexible).");
    }
}