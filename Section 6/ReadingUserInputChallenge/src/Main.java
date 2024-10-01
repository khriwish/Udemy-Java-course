import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        // int sum = 0;
        double sum = 0;

        System.out.println("Please enter 5 numbers");

        Scanner scanner = new Scanner(System.in);


        boolean goodNumber;

        // int number = 0;
        double number = 0;
        do {
            try {
                System.out.println("Enter number #" + count + ": ");
                // number = Integer.parseInt(scanner.nextLine());
                number = Double.parseDouble(scanner.nextLine());
                goodNumber = true;
            } catch (NumberFormatException UserBadData) {
                System.out.println("Invalid number");
                goodNumber = false;
            }
            if (goodNumber) {
                sum += number;
                count++;
            }
        } while (count <= 5);

        System.out.println("The sum of the 5 numbers is: " + sum);

    }

}
