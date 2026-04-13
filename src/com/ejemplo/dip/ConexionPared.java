package com.ejemplo.dip;

public class ConexionPared implements FuenteEnergia {
    @Override
    public void suministrar() {
        System.out.println("[Pared] Energía desde el enchufe de pared.");
    }
}