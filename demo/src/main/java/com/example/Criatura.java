package com.example;

// Clase abstracta que define las características base de cualquier criatura[cite: 2, 3]
public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;

    // Constructor
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    // Métodos abstractos que deben implementar las subclases[cite: 2, 3]
    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);

    // Método concreto para verificar si la criatura sigue con vida[cite: 2, 3]
    public boolean estaViva() {
        return this.salud > 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setSalud(int salud) {
        this.salud = Math.max(0, salud);
    }
}