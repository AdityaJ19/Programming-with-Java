package KeywordsAndExpressions;

public class Expressions {
    public static void main(String[] args) {
        // this double statement is an expression
        double kilometers = 1000*1.45;
        //int topscore is an expression
        int topScore = 80;
        //{} these are not expression they are the part of conditional statement
        if (topScore>60){
            topScore = 1000*(topScore +20);
        }
        //there are a total of 6 expressions in the below code
        int hostel=100;
        if ((hostel<25) && (topScore>70)){
            hostel=topScore+1000;
        }
    }
}
