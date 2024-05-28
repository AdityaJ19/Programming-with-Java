package Introduction;

public class PrecedenceOrder {
    public static void main(String[] args) {
        double d1 = 20.00d;
        double d2 = 80.00d;
        double total = (d1+d2) * 100.00;
        System.out.println(total);

        double remainder = total % 40.00;
        System.out.println(remainder);

        boolean b1 = (remainder==0)? true : false;
            System.out.println(b1);
        if(remainder != 0.0){
            System.out.println("Got some remainder");
        }

    }
}
