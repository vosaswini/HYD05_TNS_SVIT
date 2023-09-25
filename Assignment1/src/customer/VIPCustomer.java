package customer;

public class VIPCustomer extends Customer {
    private double creditLimit;

    public VIPCustomer(String name, int customerID, double creditLimit) {
        super(name, customerID);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

   
}
