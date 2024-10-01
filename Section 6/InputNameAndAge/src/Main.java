import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }


    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Enter your name: ");

        int age = Integer.parseInt(System.console().readLine("Enter your age: "));

        System.out.println("Hello " + name + ", your age is " + (currentYear - age));

        return "";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("What year were you born: >= " + (currentYear - 125)
                    + " and <= " + (currentYear));

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException e) {
                System.out.println("invalid year");
            }

        }while (!validDOB);

        return "Hello " + name + ", you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String name) {

        int dob = Integer.parseInt(name);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}

