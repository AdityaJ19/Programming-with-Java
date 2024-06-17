package CodeChallenges;

public class BonusSecMinChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3870));
        System.out.println(getDurationString(-75, 45));
        System.out.println(getDurationString(65, 145));
    }
    public static String getDurationString(int seconds) {
        if (seconds<0){
            return "Invalid output for seconds(" + seconds+ ")" +
                    " Input right data";
        }
        int minutes = seconds / 60;
        return getDurationString(seconds/60, seconds % 60);
    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes<0){
            return "Invalid output for minutes(" + minutes+ ")" +
                    " Input right data";
        }
        if (seconds > 0 || seconds < 59){
            return "Invalid output for seconds(" + seconds+ ")" +
                    " Must be between 0 and 59";
        }
        int hours = minutes /60;
        int remainingMinutes = minutes %60;

        return hours+"h " + remainingMinutes+"m " + seconds+"s ";
    }
}
