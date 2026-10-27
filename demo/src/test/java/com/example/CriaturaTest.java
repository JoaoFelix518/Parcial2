package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CriaturaTest {

    @Test
    void criaturaNuevaEstaViva() {
        Criatura criatura = new Guerrero("Aragorn", 100, 11, "Espada Andúril");
        assertTrue(criatura.estaViva());
    }

    @Test
    void criaturaConSaludCeroNoEstaViva() {
        Criatura criatura = new Guerrero("Aragorn", 100, 11, "Espada Andúril");
        criatura.setSalud(0);
        assertFalse(criatura.estaViva());
    }

    @Test
    void dragonReduceLaSaludDelObjetivo() {
        Dragon dragon = new Dragon("Smaug", 120, 10, "Escamas de Obsidiana");
        Guerrero objetivo = new Guerrero("Aragorn", 100, 11, "Espada Andúril");

        int saludInicial = objetivo.getSalud();
        dragon.atacar(objetivo);

        assertTrue(objetivo.getSalud() < saludInicial);
    }

    @Test
    void magoReduceLaSaludDelObjetivo() {
        Mago mago = new Mago("Gandalf", 90, 8, "Rayo Arcano");
        Guerrero objetivo = new Guerrero("Aragorn", 100, 11, "Espada Andúril");

        int saludInicial = objetivo.getSalud();
        mago.atacar(objetivo);

        assertTrue(objetivo.getSalud() < saludInicial);
    }

    @Test
    void guerreroReduceLaSaludDelObjetivo() {
        Guerrero guerrero = new Guerrero("Aragorn", 100, 11, "Espada Andúril");
        Mago objetivo = new Mago("Gandalf", 90, 8, "Rayo Arcano");

        int saludInicial = objetivo.getSalud();
        guerrero.atacar(objetivo);

        assertTrue(objetivo.getSalud() < saludInicial);
    }
}
