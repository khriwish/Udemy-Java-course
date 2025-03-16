import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie starWars = Movie.getMovie("Adventure","Star Wars");
//        starWars.theMovie();

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print("press A for adventure, press S for SciFi," +
                    " press C for comedy," +
                    " and press Q for " +
                    " quitting the loop");

            String type = s.nextLine();

            if("Qq".contains(type)) {
                break;
            }

            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.theMovie();

        }
    }


}
