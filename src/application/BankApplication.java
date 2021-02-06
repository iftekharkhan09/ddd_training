package application;

import com.thoughtworks.ddd.bank_account_service.domain.BankAccount;
import com.thoughtworks.ddd.customer_service.domain.Customer;

public class BankApplication {
    public static void main(String[] args) {
        Address bangalore = new Address("Bangalore");
        Customer customer = new Customer("Ashwini", bangalore);

        BankAccount bankAccount1 = new BankAccount("12345", bangalore);
        BankAccount bankAccount2 = new BankAccount("12346", bangalore);

        customer.addBankAccount(bankAccount1);
        customer.addBankAccount(bankAccount2);

        System.out.println(customer);

        customer.updateAddress(new Address("Kolkata"));

        System.out.println(customer);
    }
}
