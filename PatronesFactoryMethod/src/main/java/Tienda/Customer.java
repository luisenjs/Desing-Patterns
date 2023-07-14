package Tienda;

public class Customer {
    
    private String name;
    private CreditCard cc;

    public Customer(String name) {
        this.name = name;
    }

    public void setCc(CreditCard cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public CreditCard getCc() {
        return cc;
    }
    
}
