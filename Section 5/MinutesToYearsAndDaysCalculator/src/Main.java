public class Main {

    public static void main(String[] args) {

        printYearsAndDays(525600);

    }


    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long hours = (long) (minutes / 60);
        int days = (int) ((hours / 24) % 365);
        int years = (int) ((hours/24) / 365);
        System.out.println(minutes +" min = " + years + " y and " + days + " d");
    }

}
