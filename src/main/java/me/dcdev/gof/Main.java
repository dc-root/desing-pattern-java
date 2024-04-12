package me.dcdev.gof;

import me.dcdev.gof.singleton.SigletonEager;
import me.dcdev.gof.singleton.SingletonLazyHolder;
import me.dcdev.gof.strategy.ComportamentoAgressivo;
import me.dcdev.gof.strategy.ComportamentoDefenssivo;
import me.dcdev.gof.strategy.ComportamentoNormal;
import me.dcdev.gof.strategy.Robot;

public class Main {
    public static void main(String[] args) {
        // Singleton

        SingletonLazyHolder lazy = SingletonLazyHolder.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazyHolder.getInstance();
        System.out.println(lazy);

        SigletonEager eager = SigletonEager.getInstance();
        System.out.println(eager);
        eager = SigletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Strategy
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefenssivo defenssivo = new ComportamentoDefenssivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robot robo = new Robot();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setComportamento(defenssivo);
        robo.mover();
        robo.mover();
    }
}