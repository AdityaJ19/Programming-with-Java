package Introduction;

public class TernaryOperator {
    public static void main(String[] args) {
        String car="Honda";
        boolean isCar = car=="Honda" ? false : true;

        if (isCar){
            System.out.println("this is an example of ternary operator");
        }
        String s=(isCar) ? "this is an example of ternary operator" : "this is not an example";
        System.out.println(s);
    }
}
