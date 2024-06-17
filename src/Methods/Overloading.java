package Methods;

public class Overloading {
    public static void main(String[] args) {
        System.out.println("The score is " + calculateScore("Aditya " ,100) );
        System.out.println("The score is " + calculateScore(80));
    }
    public static int calculateScore(String name, int score){
        System.out.println("Player "+ name + " scored " + score + " in a match");
        return score*100;
    }
    public static int calculateScore(int score){
        return calculateScore("Anonymous", score);
    }
    public static int calculateScore(){
        System.out.println("No player name No player score");
        return 0;
    }
}
