package com.facade;

/**
 * Facade - Padrão Estrutural - Prover uma interface que reduza a complexidade nas
 * integrações com subsistemas.
 */

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.migrarCliente("Henrique", "50030200");

    }

}
