package com.example;


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

    
    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);

    
    public boolean estaViva() {
        return this.salud > 0;
    }

    
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