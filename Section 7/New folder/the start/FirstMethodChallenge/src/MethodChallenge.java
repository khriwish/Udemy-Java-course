public class MethodChallenge {


    public static void main(String[] args) {
        displayHighScore("fadi",calculateHighScore(1500) );
        displayHighScore("ahmad",calculateHighScore(1000) );
        displayHighScore("mohammed",calculateHighScore(500) );
        displayHighScore("ali",calculateHighScore(100) );
        displayHighScore("khaled",calculateHighScore(25) );

    }


    public static void displayHighScore(String name, int position) {
        System.out.println(name + " managed to get into the " + position + " position");
    }

    public static int calculateHighScore( int score) {
        int position = 0;
        if(score >= 1000) {
            position = 1;
            return position;
        }
        else if(score >= 500) {
            position = 2;
            return position;
        }
        else if(score >= 100) {
            position = 3;
            return position;
        }
        else{
            position = 4;
            return position;
        }

    }
 }