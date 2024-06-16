package QuestionsFromPlatforms.GFG;

public class AddDigits_258 {
    public static void main(String[] args) {
        int n = 12345678;
        digitalRoot(n);
        //System.out.println(addDigits(n));
        
    }
    public  static int addDigits(int num) {
        int sum = 0 ; 
        if(num==0){
            sum = 0 ;
        }
        else if(num==10){
            sum = 1;
        }
        else if(num%9==0){
            sum=9;
        }
        else{
            sum = num%9;
        }
        return sum;
    }
    public static void digitalRoot(int n){
        System.out.println(1+(n-1)%9);
    }
}


// * NOTE: this question is concept of DIGITAL ROOT: summing digits until a single digit is obtained.
// * [integer%9]  / Digital Root=1+(num−1)%9 works for every positive integer.
/* 
 * This means that for any integer, the remainder when it is divided by 9 is the same as the remainder when the sum of its digits is divided by 9.
 * 1. if n%9==0 then sum of digits = 9 / 1+8 = 9, 3+6 = 9, 2+7 = 9...... 
 * 2. if n%9!=0 then sum of digits until one digit is left = 199%9 = 1
 */