public class MainChallenge {

    public static void print()
    {
        System.out.print("hello");
    }

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;
        int fadi = 0;


        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println(finalScore);
        }
        print();
        print();
        print();


    }
}
