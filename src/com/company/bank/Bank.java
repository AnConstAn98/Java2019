package com.company.bank;

import com.company.customer.Customer;
import com.company.customer.CustomerType;
import com.company.product.AbstractCreditProduct;
import com.company.product.ExternalCreditProduct;
import com.company.product.InternalCreditProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bank {

    private String name;
    private Collection<AbstractCreditProduct> internalProducts;
    private Collection<AbstractCreditProduct> externalProducts;

    public Bank(String name) {
        this.name = name;
        this.internalProducts = new ArrayList<>();
        this.externalProducts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addInternalProduct(InternalCreditProduct product) {
        internalProducts.add(product);
    }

    public void addExternalProduct(ExternalCreditProduct product) {
        externalProducts.add(product);
    }

    public Collection<AbstractCreditProduct> getProducts(Customer a, double sum, int numOfDays) {
        List<AbstractCreditProduct> result = new ArrayList<>();
        if (a.getType() == CustomerType.INTERNAL) {
            return findProducts(a, sum, numOfDays, internalProducts);
        } else {
            return findProducts(a, sum, numOfDays, externalProducts);
        }
    }

    private Collection<AbstractCreditProduct> findProducts(Customer a, double sum, int numOfDays, Collection<AbstractCreditProduct> products) {
        List<AbstractCreditProduct> result = new ArrayList<>();
        for (AbstractCreditProduct product : products) {
            int minCreditAmount = product.getMinCreditAmount();
            int maxCreditAmount = product.getMaxCreditAmount();
            if (sum >= minCreditAmount && sum <= maxCreditAmount) {
                int minAvailableAge = product.getMinAvailableAge();
                int maxAvailableAge = product.getMaxAvailableAge();
                LocalDate now = LocalDate.now();
                LocalDate localDate = now.minusYears(a.getBirthday().getYear());
                int age = localDate.getYear();
                if (age >= minAvailableAge && age <= maxAvailableAge) {
                    int minCreditInterval = product.getMinCreditInterval();
                    int maxCreditInterval = product.getMaxCreditInterval();
                    if (numOfDays > minCreditInterval && numOfDays < maxCreditInterval) {
                        result.add(product);
                    }
                }
            }
        }
        return result;
    }
}
