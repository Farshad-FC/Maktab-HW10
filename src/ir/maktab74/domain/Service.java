package ir.maktab74.domain;

public class Service extends Customer{

    private String serviceType;

    private String Amount;

    public Service() {
    }

    public Service(String firstName, String lastName, String serviceType, String amount) {
        super(firstName, lastName);
        this.serviceType = serviceType;
        Amount = amount;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getAmount() {
        return Amount;
    }
}
