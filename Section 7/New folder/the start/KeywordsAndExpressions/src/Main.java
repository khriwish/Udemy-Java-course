public class Main {



    public static void main(String[] args) {

        System.out.println(convertToCentimeters(4,5));

        System.out.println(convertToCentimeters(56));

    }
    public static double convertToCentimeters (double hightInInches) {
        double v = hightInInches * 2.54;
        return v;
    }

    public static double convertToCentimeters(int hightInFeet, int reminderInInches ) {
        double feet = hightInFeet * 12;
        double total = (double) convertToCentimeters(feet + reminderInInches);
        return total;

    }

}