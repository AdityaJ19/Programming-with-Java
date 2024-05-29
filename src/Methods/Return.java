package Methods;

public class Return {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Here's i have put the values of the defined data types in the return, invoke or calling method.
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The Final Score is: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // we didn't assign any value that return to any variable and we are not using it in any expression
        // so the return statement is ignored
        System.out.println("The high score is:" +
                calculateScore(gameOver, score, levelCompleted, bonus));
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        //Since i have declared the parameters in the method argument i don't need to create variable
        // with the same name cause java will automatically create those variables for me
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalscore = score;
        if(gameOver){
            finalscore += (levelCompleted*bonus);
            finalscore +=1000;
        }
        return finalscore;
    }
}

