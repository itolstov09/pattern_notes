package com.company.behavioral.chain_of_responsibility;

import com.company.behavioral.chain_of_responsibility.chain.DispenseChain;

import java.util.List;

public class ATM {
    private final DispenseChain startOfChain;
    private final int minimalBillValue;

    public ATM(DispenseChain headOfChain, List<DispenseChain> tailOfChain, int minimalBillValue) {
        this.minimalBillValue = minimalBillValue;
        this.startOfChain = ATM.link(headOfChain, tailOfChain);
    }

    public void dispense(Currency currency) {
        if (currency.getAmount() % minimalBillValue != 0) {
            System.out.println("ABORT! Amount should be in multiple of " + minimalBillValue);
            return;
        }

        startOfChain.dispense(currency);
    }

    private static DispenseChain link(DispenseChain headOfChain, List<DispenseChain> tailOfChain) {
        DispenseChain chainPointer = headOfChain;
        for (DispenseChain chain: tailOfChain) {
            chainPointer.setNext(chain);
            chainPointer = chain;
        }
        return headOfChain;
    }
}
