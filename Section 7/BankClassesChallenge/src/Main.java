public class Main {
    public static void main(String[] args) {

        BankAccount johanny = new BankAccount(1224,2140.45,
                "John Doe","johanny@gmail.com","+972 599726390");

        BankAccount fadi = new BankAccount("aboud","aboud@gmail.com","+972 599726390");

//        johanny.setAccountNumber(00001);
//        johanny.setCustomerName("John Doe");
//        johanny.setBalance(1200);
//        johanny.setCustomerEmail("johanny@gmail.com");
//        johanny.setPhoneNumber("+972 599726390");



        johanny.deposit(500);
        johanny.withdraw(900);
        johanny.withdraw(900);
        johanny.deposit(-100);
        System.out.println(johanny.getBalance());

        System.out.println(fadi.getBalance());

        Customer firstCustomer = new Customer();
        System.out.println(firstCustomer.getName());
        System.out.println(firstCustomer.getCreditLimit());
        System.out.println(firstCustomer.getEmailAddress());



    }
}
