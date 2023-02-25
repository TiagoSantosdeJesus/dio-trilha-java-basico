package edu.tiago.padroesdeprojetos.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }

}
