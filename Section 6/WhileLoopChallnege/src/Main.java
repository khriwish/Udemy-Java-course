public class Main {

    public static void main(String[] args) {

        int start = 5;
        int count = 0;
        int oddSum = 0;
        int evenSum = 0;

        while (count < 5) {

            if(isEven(start)){evenSum += start;}
            else {oddSum += start;}
            start++;
            count++;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }

    public static boolean isEven(int number) {
        if (number % 2 != 0)
        {
            return false;
        }
        return true;
    }
}
