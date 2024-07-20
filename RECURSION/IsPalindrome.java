
//https://www.geeksforgeeks.org/problems/palindrome-string0817/1
public class IsPalindrome {
    public static void main(String[] args) {

        
    }
    public static int isPalindrome(String S) {
        int left = 0;
        int right = S.length() -1;
        return palindrome(S, left, right) ? 1 : 0;
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
