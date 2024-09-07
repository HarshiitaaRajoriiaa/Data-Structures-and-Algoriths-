// package STRINGS;
//?https://www.naukri.com/code360/problems/check-if-the-string-is-a-palindrome_1062633?leftPanelTabValue=SUBMISSION
public class Palindrome {
    public static void main(String[] args) {
    }
    public static boolean checkPalindrome(String str) {
		StringBuilder str2  = new StringBuilder();
		for(char ch : str.toCharArray()) {
            if(Character.isLetterOrDigit(ch))  str2.append(Character.toLowerCase(ch));
        }
		for(int i = 0; i < str2.length() / 2; i++) {
            if(str2.charAt(i) != str2.charAt(str2.length() - 1 - i))  return false;
        }
	return true;
	}

}
