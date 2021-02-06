package com.thoughtworks.ddd.domain.bank;

public class BankAccount {

    private String accountNumber;
    private String customerAddress;

    public BankAccount(String accountNumber, String customerAddress) {
        this.accountNumber = accountNumber;
        this.customerAddress = customerAddress;
    }


    public void setCustomerAddress(String customerAddress) {
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
