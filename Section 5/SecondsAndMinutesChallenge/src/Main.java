public class Main {

    public static void main(String[] args) {

        getDurationString(3945);

    }

    public static int getDurationString(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        if (seconds >= 0) {
        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
        else {
            return 1;
        }
        return 1;


    }

    public static int getDurationString(int minutes, int seconds) {

        int min =  (minutes * 60) + seconds;
        return getDurationString(min);
    }

}
