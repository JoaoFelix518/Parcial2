package com.example;

public class Dragon extends Criatura {
    private String escamas; // Atributo único del Dragón[cite: 3]

    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza * 2); // El dragón tiene un ataque más fuerte (multiplicado)
        this.escamas = escamas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoCausado = this.fuerza;
        System.out.println(this.nombre + " (Dragón) exhala fuego devastador sobre " + objetivo.getNombre() + " causando " + dañoCausado + " de daño.");
        objetivo.defender(dañoCausado);
    }

    @Override
    public void defender(int daño) {
        int dañoReducido = Math.max(1, daño - 5); // Sus escamas absorben parte del daño
        this.salud -= dañoReducido;
        System.out.println(this.nombre + " se protege con sus " + escamas + ", reduciendo el daño a " + dañoReducido + ". Salud restante: " + this.salud);
    }
}