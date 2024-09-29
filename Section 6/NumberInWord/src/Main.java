public class Main {
    public static void main(String[] args) {

    }

    public static void printNumberInWord(int number) {

        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2,-2 -> System.out.println("TWO");
            case 3,-3 -> System.out.println("THREE");
            case 4,-4 -> System.out.println("FOUR");
            case 5,-5 -> System.out.println("FIVE");
            case 6,-6 -> System.out.println("SIX");
            case 7,-7 -> System.out.println("SEVEN");
            case 8,-8 -> System.out.println("EIGHT");
            case 9,-9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");

        }

    }
}
