package Methods;

public class Challenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Aditya", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Arpit", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Anshul", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Akhilesh", highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get "+ position + " in the leaderboards ");
    }
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore>1000){
            position = 1;
        }
        else if (playerScore>500 && playerScore<=1000) {
            position = 2;
        }
        else if (playerScore>250 && playerScore<=500) {
            position = 3;
        }
        return position;
    }
}
