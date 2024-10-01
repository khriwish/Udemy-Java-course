import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double max = 0, min = 0;
        int loopCount = 0;


        while (loopCount ==0) {
            System.out.print("Enter a number #1: " );
            try {
                number = Double.parseDouble(scanner.nextLine());
                max = number;
                min = number;
                loopCount++;

            } catch (NumberFormatException e) {
                System.out.println("No Numbers were entered");
            }

        }


        while(true){

            try{

                System.out.print("Number: ");
                number = Double.parseDouble(scanner.nextLine());

                if(number > max){
                    max = number;
                }
                else if(number < min){
                    min = number;
                }
                loopCount++;
            }
            catch(NumberFormatException e){
                break;
            }

        }
        System.out.println("the maximum number you entered: "+ max + "\n"
                + "the minimum number you entered: "+ min);
        System.out.println("Loop count: "+ loopCount);

    }
}
