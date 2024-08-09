package LOOPS;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 6));
    }
    public static int power(int base , int power){
        int ans=1;
        for (int i = 1; i <= power; i++) {
            ans *= base;
        }
        return ans;
    }
}
