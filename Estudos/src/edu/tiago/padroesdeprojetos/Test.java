package edu.tiago.padroesdeprojetos;

import edu.tiago.padroesdeprojetos.singleton.Singleton;
import edu.tiago.padroesdeprojetos.strategy.Comportamento;
import edu.tiago.padroesdeprojetos.strategy.ComportamentoDefensivo;
import edu.tiago.padroesdeprojetos.strategy.ComportamentoNormal;
import edu.tiago.padroesdeprojetos.strategy.ComportamentoOfensivo;
import edu.tiago.padroesdeprojetos.strategy.Robo;

public class Test {
    public static void main(String[] args) {

        // Teste Singleton.
        Singleton singleton = Singleton.getInstancia();
        System.out.println(singleton);
        singleton = Singleton.getInstancia();
        System.out.println(singleton);

        // Teste Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento ofensivo = new ComportamentoOfensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(ofensivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
