public class Main {
    public static void main(String[] args) {

    Employee tim = new Employee("Tim","23/1/2002","04/01/20010");
    System.out.println(tim);
    System.out.println(tim.getAge());
    System.out.println(tim.collectPay());

    SalariedEmployee joe = new SalariedEmployee("Joe","11/04/1999",
            "12/12/2018",3400);
    System.out.println(joe);
    System.out.println(joe.getAge());
    System.out.println(joe.collectPay());

        HourlyEmployeeRate mary = new HourlyEmployeeRate("Mary","10/10/2005",
                "24/09/2009",10);
        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.getAge());


    }







}
