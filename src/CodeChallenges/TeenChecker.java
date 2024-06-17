package CodeChallenges;

public class TeenChecker {
    // write code here
    public static boolean hasTeen(int var1, int var2, int var3){
        return(var1>=13 && var1<=19) || (var2>=13 && var2<=19) || (var3>=13 && var3<=19);
    }
    public static boolean isTeen(int var4){
        return var4>=13 && var4<=19;
    }
}