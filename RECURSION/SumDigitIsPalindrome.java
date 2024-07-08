package RECURSION;
//https://www.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1
public class SumDigitIsPalindrome {
    public static void main(String[] args) {
        System.out.println(isDigitSumPalindrome(56));
    }
    public static int isDigitSumPalindrome(int n) {
        int sum = getSum(n); //get sum
        String number = String.valueOf(sum);
        int result = palindrome(number, 0, number.length() -1)? 1:0;
        return result;
        
    }
    public static int getSum(int n){
        String num = String.valueOf(n);
        int sum = 0 ; 
        for(int i=0;i<num.length() ;i++){
            sum = sum + Integer.parseInt((String.valueOf(num.charAt(i))));
        }
        return sum;
    }
    public static boolean  palindrome(String S , int left, int right) {
      if(left >=right){
         return  true;
      }
      if (S.charAt(left) != S.charAt(right)) {
            return false;
        }
    return palindrome(S, left + 1, right - 1);  
    }
}
