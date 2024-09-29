public class Main {

    public static void main(String[] args) {


        int sum = 0;
        int count = 0;


        for (int i = 1; i <= 1000; i++) {
            if (count < 5){
                if (i % 3 == 0 && i % 5 == 0) {
                    sum += i;
                    System.out.println(i + " is a match!");
                    count++;

                }
            }
        }
        System.out.println("the sum of all the matchings is = "+sum);

    }
}