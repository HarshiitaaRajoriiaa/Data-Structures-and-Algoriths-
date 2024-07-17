package QUESTIONS.LOOPS.Loops3;

public class Amstrong {
    public static void main(String[] args) {
        System.out.println(amstrong(371));
    }
    public static boolean amstrong(int n){
        int number = n;
        String num = String.valueOf(n);
        int l = num.length();
        double sum = 0;
        boolean result = false;
        while(n!=0){
            int curr = n%10;
            sum = sum + Math.pow(curr, l);
            n/=10;
        }
        if(sum==number){
            result = true;
        }
        return result;
    }
}
