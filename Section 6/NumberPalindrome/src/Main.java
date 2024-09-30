public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static int isPalindrome(int number)
    {
        int reverse = 0;
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


        for(; howLong > 0 ; howLong--)
        {
            reverse = (reverse * 10) + temp % (10);
            temp = temp / 10;

        }

        if(reverse == number)
        {
            return reverse;
        }


        return reverse;
    }
}
