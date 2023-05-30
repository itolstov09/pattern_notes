package com.company.behavioral.strategy;

import com.company.behavioral.strategy.payment_strategy.PaymentStrategy;
import com.company.behavioral.strategy.payment_strategy.PaymentStrategyCreditCard;
import com.company.behavioral.strategy.payment_strategy.PaymentStrategyPayPal;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategyFactory {
    private final Map<PaymentType, PaymentStrategy> strategyMap = new HashMap<>(){{
        put(PaymentType.PAYPAL, new PaymentStrategyPayPal());
        put(PaymentType.CREDIT_CARD, new PaymentStrategyCreditCard());

    }};

    public PaymentStrategy getByPaymentType(PaymentType paymentType) {
        return strategyMap.get(paymentType);
    }
}
