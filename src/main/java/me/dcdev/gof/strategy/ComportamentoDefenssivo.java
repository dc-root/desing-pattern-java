package me.dcdev.gof.strategy;

public class ComportamentoDefenssivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo defensivamente...");
    }
}
