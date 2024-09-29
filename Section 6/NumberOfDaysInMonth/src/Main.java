public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1));
        getDaysInMonth(2,2000);
    }

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) {
            return false;
        }
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

            return true;
        }
        return false;


    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            return -1;
        }
        else if (year < 1 || year > 9999) {
            return -1;
        }

            boolean i = isLeapYear(year);

        if (i) {
            return switch (month) {

                case 1, 3, 5, 7, 8, 10, 12 -> {
                    yield 31;
                }
                case 2 -> {
                    yield 29;
                }
                case 4, 6, 9, 11 -> {
                    yield 30;
                }
                default -> -1;
            };
        }
        else if (i == false) {
            return switch (month) {

                case 1, 3, 5, 7, 8, 10, 12 -> {
                    yield 31;
                }
                case 2 -> {
                    yield 28;
                }
                case 4, 6, 9, 11 -> {
                    yield 30;
                }
                default -> -1;
            };

        }

        return 0;
    }

}
