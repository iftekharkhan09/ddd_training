package com.thoughtworks.ddd.domain.bank;

import application.Address;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private Address address;

    private List<BankAccount> bankAccountList;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
        this.bankAccountList = new ArrayList<>();
    }

    public void addBankAccount(BankAccount account) {
        this.bankAccountList.add(account);
    }

    public void updateAddress(Address address) {
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
