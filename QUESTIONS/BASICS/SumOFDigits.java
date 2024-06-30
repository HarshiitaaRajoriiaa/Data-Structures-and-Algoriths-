package QUESTIONS.BASICS;
import java.util.Scanner;
public class SumOFDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 12;
        System.out.println(sumOfDigits1(N));
        System.out.println(sumOfDigits2(N));
    }
    //METHOD:01
    public static int sumOfDigits1(int N) {
        int sum = 0 ;
        while(N>0){
            sum = sum + N%10;
            N = N/10;
        }
        return sum;
    }
    
    //METHOD:02
     public static int sumOfDigits2(int N) {
        int sum = 0 ; 
        for(int i=N ; i > 0 ; i/=10){
            sum = sum + i%10;
        }
        return sum;
    }
    
}
