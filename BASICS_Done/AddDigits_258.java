
// TODO : https://leetcode.com/problems/add-digits/
public class AddDigits_258 {
    public static void main(String[] args) {
        System.out.println(addDigits(188));
        
    }
    public static int  addDigits(int n){
        int sum = 0 ; 
        if(n==0){
            sum =  0 ;
        }
        if(n%9==0){
            sum =  9;
        }
        if(n%9!=0){
            sum =  n%9;
        }
        return sum;
    }
}


//! if digit is multiple of 9, then sum of digits = 9
//! if not then, sum of digits = digit % 9 
