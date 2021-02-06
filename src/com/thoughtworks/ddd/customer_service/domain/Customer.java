package com.thoughtworks.ddd.customer_service.domain;

import application.Address;
import com.thoughtworks.ddd.bank_account_service.domain.BankAccount;

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
//        this.bankAccountList.stream().forEach(account -> account.setCustomerAddress(address));
        // Create and send UpdateAddessEvent, flat structure
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
