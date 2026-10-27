package com.example;

public class Guerrero extends Criatura {
    private String arma; // Atributo único del Guerrero

    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoCausado = this.fuerza + 2; // Ataque cuerpo a cuerpo con arma
        System.out.println(this.nombre + " (Guerrero) ataca con su " + arma + " a " + objetivo.getNombre() + " infligiendo " + dañoCausado + " de daño.");
        objetivo.defender(dañoCausado);
    }

    @Override
    public void defender(int daño) {
        int dañoReducido = Math.max(1, daño - 4); // Escudo y armadura
        this.salud -= dañoReducido;
        System.out.println(this.nombre + " bloquea con su armadura, reduciendo el daño a " + dañoReducido + ". Salud restante: " + this.salud);
    }
}