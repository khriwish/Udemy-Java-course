import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        int count = 0;
        double average = 0;
        int sum = 0;
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

                number = Integer.parseInt(scanner.nextLine());
                sum += (int) number;
                count++;
                average = (double) sum / (double) count;
            } catch (NumberFormatException e) {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }


        }

    }

}
