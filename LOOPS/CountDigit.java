package LOOPS;
import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        System.out.println(countDigit(n));
    }
    public static int countDigit(int N){
        int counter=0;
        while(N>0){
            N/=10;
            counter++;
        }
        return counter;
    }
}
