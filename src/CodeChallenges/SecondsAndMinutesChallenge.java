package CodeChallenges;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3870));
        System.out.println(getDurationString(75, 45));

    }
    public static String getDurationString(int seconds){
        //2-Step approach
        int minutes = seconds /60;
        return getDurationString(minutes, seconds);
//        int hours = minutes /60;
//        System.out.println("Hours=" + hours);

//        int remainingMinutes = minutes %60;
//        System.out.println("Minutes= "+ minutes);
//        System.out.println("Minutes= "+remainingMinutes);
        //1- Step approach
//        int hours1 = seconds/3600;
//        int remainingSeconds = seconds % 60;
//        System.out.println("Seconds= "+ remainingSeconds);

//        return hours+"h " + remainingMinutes+"m " + remainingSeconds+"s ";
    }
    public static String getDurationString(int minutes, int seconds){
        int hours = minutes /60;
//        System.out.println("Hours=" + hours);

        int remainingMinutes = minutes %60;
//        System.out.println("Minutes= "+ minutes);
//        System.out.println("Minutes= "+remainingMinutes);
        //1- Step approach
//        int hours1 = seconds/3600;
        int remainingSeconds = seconds % 60;
//        System.out.println("Seconds= "+ remainingSeconds);

        return hours+"h " + remainingMinutes+"m " + remainingSeconds+"s ";
    }
}