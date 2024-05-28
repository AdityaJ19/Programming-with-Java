package ConditionalStatements;

public class Challenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalscore = score;
        if(gameOver){
            finalscore += (levelCompleted*bonus);
            System.out.println("Final Score: "+ finalscore);
        }
        levelCompleted = 8;
        bonus = 200;
        score = 10000;

        finalscore = score;

        if(gameOver){
            finalscore += (levelCompleted*bonus);
            System.out.println("Final Score: "+ finalscore);
        }
    }
}
