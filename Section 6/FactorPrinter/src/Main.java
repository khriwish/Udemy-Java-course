public class Main {

    public static void main(String[] args) {

        printFactors(10);

    }

    public static void printFactors(int number){

        if(number < 1){
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(1);

        for(int i = 2; i <= number; i++)
        {
            if(number % i == 0)
            {
                System.out.println(i);
            }
        }

    }
}
