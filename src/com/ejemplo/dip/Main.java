package com.ejemplo.dip;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== DEMOSTRACIÓN SOLID: DIP ===");

        // 1. Probamos el código MALO
        System.out.println("\n1. CASO SIN DIP:");
        LamparaSinDIP mala = new LamparaSinDIP();
        mala.encender();

        System.out.println("\n------------------------------");

        // 2. Probamos el código BUENO (Inversión)
        System.out.println("2. CASO CON DIP (Intercambiable):");

        // Podemos usar la pared...
        FuenteEnergia pared = new ConexionPared();
        Lampara buena1 = new Lampara(pared);
        buena1.encender();

        // ...o cambiar a batería SIN TOCAR la clase Lampara
        FuenteEnergia bateria = new Bateria();
        Lampara buena2 = new Lampara(bateria);
        buena2.encender();
    }
}