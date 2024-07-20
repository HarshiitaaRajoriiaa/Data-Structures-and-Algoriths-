package LOOPS.Loops1;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
    public static double power(double  base , double exponent ){
        double ans = 1;
        for(double i = exponent ; i>0;i-- ){
            ans = ans*base;
        }
        return ans;
    }
}
