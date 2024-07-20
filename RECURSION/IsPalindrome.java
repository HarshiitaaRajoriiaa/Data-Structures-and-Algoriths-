
//https://www.geeksforgeeks.org/problems/palindrome-string0817/1
public class IsPalindrome {
    public static void main(String[] args) {        
    }
    public int isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
      }
      
      private static int isPalindromeHelper(String s, int start, int end) {
        if (start >= end) { // Base case: single character or empty string (palindrome)
          return 1;
        }
        if (s.charAt(start) != s.charAt(end)) { // Not a palindrome
          return 0;
        }
        return isPalindromeHelper(s, start + 1, end - 1); // Recursively check remaining substring
      }
      
}
