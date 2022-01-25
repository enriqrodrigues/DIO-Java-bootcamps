package com.strategy;

/**
 * Strategy - Padrão comportamental - Busca simplificar a variação de determinados algoritmos
 * para a resolução de um mesmo problema a partir de uma mesma interface.
 */

public class Main {

    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

    }

}
