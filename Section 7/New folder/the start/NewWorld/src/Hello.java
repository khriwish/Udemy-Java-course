public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello Tim");

        boolean isCar = false;
        if (!isCar){
            System.out.println("I'm not car");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic){
            System.out.println("Domestic");
        }

        String s = (isDomestic) ? "this car is domestic" : "this car is not domestic";
        System.out.println(s);

        double fistNumber = 20d;
        double secondNumber = 80d;
        double total = (fistNumber + secondNumber) * 100;
        double reminder = total%40;
        boolean divisable  = (reminder == 0) ? true : false;
        if (divisable){
            System.out.println("Divisable");
        }
        else {
            System.out.println(reminder);
            System.out.println("Not Divisable");
        }



    }
}


