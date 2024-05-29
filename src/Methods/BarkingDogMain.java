package Methods;

public class BarkingDogMain {
    public static void main(String[] args) {
        BarkingDog bark = new BarkingDog();
        boolean wakeup = true;
        wakeup = bark.shouldWakeUp(true, 1);
        System.out.println(wakeup);
        wakeup = bark.shouldWakeUp(false, 2);
        System.out.println(wakeup);
        wakeup = bark.shouldWakeUp(true, 8);
        System.out.println(wakeup);
        wakeup = bark.shouldWakeUp(true, -1);
        System.out.println(wakeup);
    }

}
