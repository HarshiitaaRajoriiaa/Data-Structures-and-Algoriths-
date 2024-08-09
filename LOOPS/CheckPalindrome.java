package LOOPS;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(123421));
    }
    public static boolean checkPalindrome(int N) {
        String n = String.valueOf(N);
        int l = n.length();
        boolean yes = true;
        // Swap characters to reverse the array
        for (int i = 0; i < l / 2; i++) {
            if(n.charAt(i) != n.charAt(l-1-i)) yes = false;
        }
        return yes;
    }
}
