package com.company.product;

public abstract class AbstractCreditProduct {
    private String name;
    private float interestRate;
    private int minCreditAmount;
    private int maxCreditAmount;
    private int minAvailableAge;
    private int maxAvailableAge;
    private int minCreditInterval;
    private int maxCreditInterval;

    public AbstractCreditProduct(String name, float interestRate, int minCreditAmount, int maxCreditAmount, int minAvailableAge, int maxAvailableAge, int minCreditInterval, int maxCreditInterval) {
        this.name = name;
        this.interestRate = interestRate;
        this.minCreditAmount = minCreditAmount;
        this.maxCreditAmount = maxCreditAmount;
        this.minAvailableAge = minAvailableAge;
        this.maxAvailableAge = maxAvailableAge;
        this.minCreditInterval = minCreditInterval;
        this.maxCreditInterval = maxCreditInterval;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public int getMinCreditAmount() {
        return minCreditAmount;
    }

    public void setMinCreditAmount(int minCreditAmount) {
        this.minCreditAmount = minCreditAmount;
    }

    public int getMaxCreditAmount() {
        return maxCreditAmount;
    }

    public void setMaxCreditAmount(int maxCreditAmount) {
        this.maxCreditAmount = maxCreditAmount;
    }

    public int getMinAvailableAge() {
        return minAvailableAge;
    }

    public void setMinAvailableAge(int minAvailableAge) {
        this.minAvailableAge = minAvailableAge;
    }

    public int getMaxAvailableAge() {
        return maxAvailableAge;
    }

    public void setMaxAvailableAge(int maxAvailableAge) {
        this.maxAvailableAge = maxAvailableAge;
    }

    public int getMinCreditInterval() {
        return minCreditInterval;
    }

    public void setMinCreditInterval(int minCreditInterval) {
        this.minCreditInterval = minCreditInterval;
    }

    public int getMaxCreditInterval() {
        return maxCreditInterval;
    }

    public void setMaxCreditInterval(int maxCreditInterval) {
        this.maxCreditInterval = maxCreditInterval;
    }
}
