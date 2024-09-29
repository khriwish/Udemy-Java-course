public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(1,11));


    }

    public static boolean isOdd(int num) {
        if (num < 0) {return false;}

        if(num % 2 != 0) {return true;}
        return false;

    }

    public static int sumOdd(int start,int end) {

        int sum = 0;

        if(start < 0 || end < 0 || start > end)
        {
            return -1;
        }

        for(; start <= end; start++)
        {
            if(start % 2 != 0) {
                sum += start;
            }
        }

        return sum;

    }
}
