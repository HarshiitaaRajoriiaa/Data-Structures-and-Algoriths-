package QuestionsFRomPlatforms.GFG;
import java.util.Scanner;
public class SumOFDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 123455;
        sumOfDigits(N);
        sumOfDigits2(N);
    }
    //METHOD:01
    public static void sumOfDigits(int N){
        for(int j = 1 ; j<N ; j++){
            int sumOfDigits = 0 ;
            int curr = j;
            while(curr>0){
                sumOfDigits +=curr%10;
                curr/=10;
                }
            System.out.println(j + " : " + sumOfDigits);
        }
    }
    
    //METHOD:02
     public static int sumOfDigits2(int N) {
        int sum = 0 ; 
        for(int i=N ; i <0 ; i/=10){
            sum = sum + N%10;
        }
        return sum;
    }
    
}
