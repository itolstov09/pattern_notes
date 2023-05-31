package com.company.behavioral.chain_of_responsibility.chain;

import com.company.behavioral.chain_of_responsibility.Currency;

public interface DispenseChain {

    void setNext(DispenseChain chain);

    void dispense(Currency currency);

}
