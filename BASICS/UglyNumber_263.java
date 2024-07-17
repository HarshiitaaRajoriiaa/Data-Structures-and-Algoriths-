package QUESTIONS.BASICS;
//https://leetcode.com/problems/ugly-number/
public class UglyNumber_263 {
    public static void main(String[] args) {
        System.out.println(isUgly(21));
        
    }
    public  static boolean isUgly(int n) {
        // 2, 3, 5
        if(n<=0) {
            return false;
        }
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }

        return(n==1);
    }
}
    



/* 
 * NOTE:
 *  also called "regular numbers" or "Hamming numbers" = 2^a * 3^b * 5^c
*/



