public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Customer created");
    }

    public Customer() {
        this("aboud", 50 , "aboud@aboud.com");
        System.out.println("Empty constructor used");
    }

    public Customer(String name,String emailAddress) {
        this(name,999,emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
