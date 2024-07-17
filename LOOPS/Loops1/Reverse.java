package QUESTIONS.LOOPS.Loops1;
public class Reverse{
    public static void main(String[] args) {
        
        System.out.println(reverse(123));
    }
    public static int reverse(int n){
        int sol = 0;
        while(n!=0){
            int curr = n%10;
            sol = sol*10 + curr;
            n/=10;
        }
        return sol;
    }
}