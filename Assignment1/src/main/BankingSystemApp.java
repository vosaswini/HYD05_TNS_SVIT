package main;
public class BankingSystemApp {
    public static void main(String[] args) {
 
        bank.Bank bank = new bank.Bank("MyBank");

        bank.Account account1 = new bank.Account(1, 1000.0);
        bank.Account account2 = new bank.Account(2, 2000.0);

        // Create customers
        customer.RegularCustomer customer1 = new customer.RegularCustomer("Alice", 101);
        customer.VIPCustomer customer2 = new customer.VIPCustomer("Bob", 102, 5000.0);

        // Perform some bank operations
        account1.deposit(500.0);
        account2.withdraw(1000.0);

        // Display information
        System.out.println("Welcome to " + bank.getBankName());
        System.out.println("Customer: " + customer1.getName() + " (" + customer1.getCustomerID() + ")");
        System.out.println("Account balance: $" + account1.getBalance());

        System.out.println("Customer: " + customer2.getName() + " (" + customer2.getCustomerID() + ")");
        System.out.println("Account balance: $" + account2.getBalance());
        System.out.println("Credit Limit: $" + customer2.getCreditLimit());
    }
}
