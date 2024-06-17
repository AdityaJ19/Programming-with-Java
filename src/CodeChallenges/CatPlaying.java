package CodeChallenges;

public class CatPlaying {
    public static void main(String[] args) {
        isCatPlaying(true, 35);
        System.out.println(isCatPlaying(true, 35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}
