package com.example;

public class Mago extends Criatura {
    private String hechizos; // Atributo único del Mago[cite: 3]

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoCausado = this.fuerza + 4; // Ataque basado en magia
        System.out.println(this.nombre + " (Mago) lanza el hechizo '" + hechizos + "' contra " + objetivo.getNombre() + " causando " + dañoCausado + " de daño.");
        objetivo.defender(dañoCausado);
    }

    @Override
    public void defender(int daño) {
        int dañoReducido = Math.max(1, daño - 3); // Barrera mágica
        this.salud -= dañoReducido;
        System.out.println(this.nombre + " despliega una barrera mágica, reduciendo el daño recibido a " + dañoReducido + ". Salud restante: " + this.salud);
    }
}