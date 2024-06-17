package Methods;

public class OverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in :" + convertToCentimeters(5, 8)+ " cm");
        System.out.println("6in :" + convertToCentimeters(68)+ " cm");

    }
    public static double convertToCentimeters(int heightInInches){
        return heightInInches*2.54;
    }
    public static double convertToCentimeters(int heightInFeets, int remainingInches){
//        return convertToCentimeters((heightInFeets*12)+ remainingInches);
        int feetToInches = heightInFeets * 12;
        int totalInches = feetToInches + remainingInches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
