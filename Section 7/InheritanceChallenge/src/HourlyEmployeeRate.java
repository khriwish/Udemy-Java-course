public class HourlyEmployeeRate extends Employee{
    private double hourlyPay;

    public HourlyEmployeeRate(String name, String birthDate, String hireDate, double hourlyPay) {
        super(name, birthDate, hireDate);
        this.hourlyPay = hourlyPay;
    }


    @Override
    public double collectPay(){
    return 40 * hourlyPay;
    }

    public double getDoublePay(){
        return 2 * hourlyPay;
    }



}
