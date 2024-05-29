package Methods;

public class Method {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Here's i have put the values of the defined data types in the return, invoke or calling method.
        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
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
            System.out.println("Final Score: "+ finalscore);
        }
    }
}

