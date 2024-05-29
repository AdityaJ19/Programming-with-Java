package Methods;

public class MegaBytesConvertor {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
            return;
        }
        //variables
        int megaBytes = 0; //stores megabytes converted kilobytes
        int remainder = 0; // remaining kilobytes after megabytes
        //Calculations
        megaBytes = kiloBytes /1024;
        remainder = kiloBytes % 1024;
        //Output
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
    }
}
