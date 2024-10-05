public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String PhoneNumber;

    public BankAccount() {
        this(9999,1.0,"DEFUALT NAME","DEFUALT EMAIL","DEFUALT PHONE NUMBER");
        System.out.println("Empty Constructor Called");
    }



    public BankAccount(int accountNumber, double balance, String customerName,
                       String customerEmail, String PhoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.PhoneNumber = PhoneNumber;

    }

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this(1000,5.0,customerName,customerEmail,phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }


    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return;
        }
        this.balance += amount;
        System.out.println("Deposit Successful. Your Balance is: " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Unavailable Funds.");
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrawal of amount " + amount + " successful."
                + " Your Balance is: " + this.balance);

    }

}
