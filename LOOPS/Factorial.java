package LOOPS;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int N){
        int fact=1;
        for(int i =1;i<=N;i++){
            fact *=i;
        }
        return fact;
    }
}
