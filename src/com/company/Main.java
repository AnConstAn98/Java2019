package com.company;

import com.company.bank.Bank;
import com.company.customer.Customer;
import com.company.customer.CustomerType;
import com.company.product.AbstractCreditProduct;
import com.company.product.ExternalCreditProduct;
import com.company.product.InternalCreditProduct;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bank alfaBank = new Bank("Alfa-bank");
        alfaBank.addInternalProduct(new InternalCreditProduct("alfabank1",10, 10_000, 100_000, 18, 50, 50, 1000));
        alfaBank.addInternalProduct(new InternalCreditProduct("alfabank2", 3, 1_000, 5_000, 18, 25, 50, 1000));
        alfaBank.addExternalProduct(new ExternalCreditProduct("alfabank3", 24, 10_000, 100_000_000, 18, 50, 50, 1000));

        Bank sber = new Bank("Sberbank");
        sber.addInternalProduct(new InternalCreditProduct("sber1",1, 1_000, 10_000, 18, 50, 50, 1000));
        sber.addInternalProduct(new InternalCreditProduct("sber2", 2, 1_000, 5_000, 18, 25, 50, 1000));
        sber.addExternalProduct(new ExternalCreditProduct("sber3",3, 10_000, 100_000_000, 18, 50, 50, 1000));

        List<Bank> banks = Arrays.asList(alfaBank, sber);

        Customer firstClient = new Customer("Maria", "Ivanova", LocalDate.of(1980, Month.MARCH, 15), CustomerType.INTERNAL);

        for (Bank bank : banks) {
            Collection<AbstractCreditProduct> products = bank.getProducts(firstClient, 10_000, 100);
            if (!products.isEmpty()) {
                System.out.println("Found products for client " + firstClient.getFirstName() + " " + firstClient.getLastName() + " in bank " + bank.getName());
                for (AbstractCreditProduct product : products) {
                    System.out.println(product.getName() + ", " + product.getInterestRate() + " interest rate");
                }
            } else {
                System.out.println("No products have been found.");
            }
        }
    }
}
