package com.thoughtworks.ddd.domain.bank;

import application.Address;

public class BankAccount {

    private String accountNumber;
    private Address customerAddress;

    public BankAccount(String accountNumber, Address customerAddress) {
        this.accountNumber = accountNumber;
        this.customerAddress = customerAddress;
    }


    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
