package ConditionalStatements;

public class IfThenStatement {
    public static void main(String[] args) {

        boolean isAlien=true;
        if(isAlien == true){
            System.out.println("This is not an alien");
        }

        int topScore=80;
        if (topScore != 100){
            System.out.println("you scored highest marks");
        }
        int secondTopScore=60;
        if (topScore > secondTopScore && topScore<100){
            System.out.println("this is cool for using and operator");
        }
        if (topScore<secondTopScore || topScore<100){
            System.out.println("this is also cool for using or operator");
        }
    }
}
