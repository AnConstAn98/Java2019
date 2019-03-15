package com.company.product;

public class InternalCreditProduct extends AbstractCreditProduct {

    public InternalCreditProduct(String name, float interestRate, int minCreditAmount, int maxCreditAmount, int minAvailableAge, int maxAvailableAge, int minCreditInterval, int maxCreditInterval) {
        super(name, interestRate, minCreditAmount, maxCreditAmount, minAvailableAge, maxAvailableAge, minCreditInterval, maxCreditInterval);
    }
}
