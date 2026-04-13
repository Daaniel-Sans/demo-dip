package com.ejemplo.dip;

public class Bateria implements FuenteEnergia {
    @Override
    public void suministrar() {
        System.out.println("[Batería] Energía desde celdas químicas.");
    }
}