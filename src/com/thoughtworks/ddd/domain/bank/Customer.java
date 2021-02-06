package com.thoughtworks.ddd.domain.bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String address;

    private List<BankAccount> bankAccountList;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.bankAccountList = new ArrayList<>();
    }

    public void addBankAccount(BankAccount account) {
        this.bankAccountList.add(account);
    }

    public void updateAddress(String address) {
        this.address = address;
        this.bankAccountList.stream().forEach(account -> account.setCustomerAddress(address));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", bankAccountList=" + bankAccountList +
                '}';
    }
}
