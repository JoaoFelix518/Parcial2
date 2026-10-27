package com.example;

public class Main {

    // Método para simular la batalla entre dos criaturas hasta que una muera[cite: 2, 3]
    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        System.out.println("\n==============================================");
        System.out.println(" INICIA LA BATALLA: " + criatura1.getNombre() + " VS " + criatura2.getNombre());
        System.out.println("==============================================");

        int turno = 1;
        while (criatura1.estaViva() && criatura2.estaViva()) {
            System.out.println("\n--- Turno " + turno + " ---");

            // Turno de la criatura 1 atacando
            criatura1.atacar(criatura2);
            if (!criatura2.estaViva()) {
                break;
            }

            // Turno de la criatura 2 atacando
            criatura2.atacar(criatura1);
            if (!criatura1.estaViva()) {
                break;
            }

            turno++;
        }

        System.out.println("\n----------------------------------------------");
        System.out.println(" RESULTADO FINAL DE LA BATALLA");
        System.out.println("----------------------------------------------");
        if (criatura1.estaViva()) {
            System.out.println("🏆 ¡Ganador: " + criatura1.getNombre() + " con " + criatura1.getSalud() + " HP restantes!");
        } else {
            System.out.println("🏆 ¡Ganador: " + criatura2.getNombre() + " con " + criatura2.getSalud() + " HP restantes!");
        }
    }

    public static void main(String[] args) {
        // Creación de instancias usando polimorfismo (Criatura referenciando subclases)[cite: 2]
        Criatura dragon = new Dragon("Smaug", 120, 10, "Escamas de Obsidiana");
        Criatura mago = new Mago("Gandalf", 90, 8, "Rayo Arcano");
        Criatura guerrero = new Guerrero("Aragorn", 100, 11, "Espada Andúril");

        // Simulación de batallas
        simularBatalla(dragon, mago);
        simularBatalla(mago, guerrero);
    }
}