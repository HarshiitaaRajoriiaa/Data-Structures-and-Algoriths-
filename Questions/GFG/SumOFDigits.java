package Questions.GFG;
import java.util.Scanner;
public class SumOFDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    //METHOD:01
    System.out.println("give the range from 1 to n?");
    n = sc.nextInt();
    for(int j = 1 ; j<=n ; j++){
        int sumOfDigits = 0 ;
        int curr = j;
        while(curr>0){
            sumOfDigits +=curr%10;s
            curr/=10;
            }
        System.out.println(j + " : " + sumOfDigits);
    }
    
    //METHOD:02
    int sumOfDigits2(int N) {
        int sum = 0 ; 
        for(int i=N ; i <0 ; i/10){
            sum = sum + N%10;
        }
        return sum;
    }
    sc.close();
}
