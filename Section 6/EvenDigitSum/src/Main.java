public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-1231122));

    }



    public static int getEvenDigitSum(int number) {
        int test = 0;
        int temp = number;
        int howLong = 1;

        while (temp != 0)
        {
            if (temp < 0)
            {
                temp = temp * -1;
            }
            temp = temp / 10;
            if(temp > 0)
            {
                howLong++;
            }


            }
            temp = number;

            int sum = 0;
            for(; howLong > 0 ; howLong--)
            {

                test += temp % (10);
                if(test % 2 == 0)
                {
                    sum += test;
                }
                temp = temp / 10;
                test = 0;

            }


            return sum;
        }
}
