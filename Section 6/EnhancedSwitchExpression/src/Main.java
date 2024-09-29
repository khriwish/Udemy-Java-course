public class Main {
    public static void main(String[] args) {
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        printDayOfWeek(8);


    }

    public static void printDayOfWeek(int day) {

        switch (day) {
            case 1 -> System.out.println(day + " is the day Monday");
            case 2 -> System.out.println(day + " is the day Tuesday");
            case 3 -> System.out.println(day + " is the day Wednesday");
            case 4 -> System.out.println(day + " is the day Thursday");
            case 5 -> System.out.println(day + " is the day Friday");
            case 6 -> System.out.println(day + " is the day Saturday");
            case 7 -> System.out.println(day + " is the day Sunday");
            default -> System.out.println("Invalid Day");

        }
    }

}
