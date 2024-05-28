package ConditionalStatements;

public class ifElseifElseStatement {
    public static void main(String[] args) {
        int marks = 80;
        int top = 97;
        int total = 100;
        //okay so in if else-if else statement firstly the condition 1st is checked
        // if the condition 1 is true then it prints the output
        if(marks>=total){
            System.out.println("you are passed");

        //if the 1st statement is false then the next statement is checked
            // i.e else-if statement so if that statement is true then the else-id statement is printed
        } else if (top<=marks) {
            System.out.println("you are topper");
            //if both statement is false then the else statement is printed else statement is optional
        }
        else{
            System.out.println("You failed");
        }
    }
}
