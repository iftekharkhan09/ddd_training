package application;

import com.thoughtworks.ddd.domain.bank.BankAccount;
import com.thoughtworks.ddd.domain.bank.Customer;

public class BankApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Ashwini", "Bangalore");

        BankAccount bankAccount1 = new BankAccount("12345", "Bangalore");
        BankAccount bankAccount2 = new BankAccount("12346", "Bangalore");

        customer.addBankAccount(bankAccount1);
        customer.addBankAccount(bankAccount2);

        System.out.println(customer);

        customer.updateAddress("Gujarat");

        System.out.println(customer);
    }
}
