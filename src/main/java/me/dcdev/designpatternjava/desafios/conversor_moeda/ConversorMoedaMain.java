package me.dcdev.designpatternjava.desafios.conversor_moeda;

import java.util.Scanner;

// Antiga classe de conversão que só suporta a conversão de USD para GBP
class OldCurrencyConverter {
    public double convertUSDtoGBP(double amount) {
        return amount * 0.80; // 80% do valor em USD
    }
}

// Novo adaptador que usa a antiga conversão e aplica a taxa adicional de GBP para EUR
class CurrencyAdapter {
    private final OldCurrencyConverter oldConverter;

    public CurrencyAdapter(OldCurrencyConverter oldConverter) {
        this.oldConverter = oldConverter;
    }

    public double convertUSDtoEUR(double amount) {
        return amount * 0.85;
    }
}


public class ConversorMoedaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        OldCurrencyConverter oldConverter = new OldCurrencyConverter();
        CurrencyAdapter adapter = new CurrencyAdapter(oldConverter);

        double output = adapter.convertUSDtoEUR(input);

        System.out.println("USD: " + input);
        System.out.println("EUR: " + output);
    }
}
