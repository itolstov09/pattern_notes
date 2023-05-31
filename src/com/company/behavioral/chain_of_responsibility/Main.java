package com.company.behavioral.chain_of_responsibility;

import com.company.behavioral.chain_of_responsibility.chain.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DispenseChain head = new Dollar50Dispenser();
        List<DispenseChain> tail = List.of(
                new Dollar20Dispenser(),
                new Dollar10Dispenser(),
                new Dollar5Dispenser()
        );

        ATM atm = new ATM(head, tail, 5);

        List<Currency> currencyList = List.of(
                new Currency(55),
                new Currency(51),
                new Currency(50),
                new Currency(20),
                new Currency(10),
                new Currency(60),
                new Currency(70),
                new Currency(100),
                new Currency(120),
                new Currency(130)
        );

        for (Currency currency : currencyList) {
            System.out.println("==================================================");
            System.out.println("Dispense amount: " + currency.getAmount());
            atm.dispense(currency);
            System.out.println("==================================================");
        }
    }
}
