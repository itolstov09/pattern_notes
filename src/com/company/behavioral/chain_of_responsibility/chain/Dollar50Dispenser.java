package com.company.behavioral.chain_of_responsibility.chain;

import com.company.behavioral.chain_of_responsibility.Currency;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;


    @Override
    public void setNext(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        int billValue = 50;

        if (currency.getAmount() >= billValue) {
            int countOfTargetBill = currency.getAmount() / billValue;
            System.out.printf("Dispensing %d %d$ note%n", countOfTargetBill, billValue);
            int remainder = currency.getAmount() % billValue;
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }

    }
}
