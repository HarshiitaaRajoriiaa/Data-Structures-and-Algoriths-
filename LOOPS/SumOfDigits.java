package LOOPS;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        System.out.println(countDigit(n));
    }
    public static int countDigit(int N){
        int sum=0;
        while(N>0){
            sum +=N%10;
            N/=10;
        }
        return sum;
    }
}
