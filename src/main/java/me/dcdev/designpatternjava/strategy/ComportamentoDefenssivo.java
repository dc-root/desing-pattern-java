package me.dcdev.designpatternjava.strategy;

public class ComportamentoDefenssivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo defensivamente...");
    }
}
