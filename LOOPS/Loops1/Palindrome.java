package LOOPS.Loops1;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(123));
        
    }
    public static boolean palindrome(int n){//harssrah
        String num=String.valueOf(n);
        boolean sol = true;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i) != num.charAt(num.length() - i-1)){
                sol = false;
                break;
            }
        }
        return sol;
    }
}
