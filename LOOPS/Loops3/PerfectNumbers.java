package QUESTIONS.LOOPS.Loops3;
public class PerfectNumbers{
    public static void main(String[] args) {
        perfectNumbers(1, 10);
    }
    public static void perfectNumbers(int initial , int Final){
        for(int i = initial ; i<=Final;i++){
            int summ = sumOfDivisos(i);
            // System.out.println( i + " :" + summ);
            if(i==summ){
                System.out.println(i);
            }
        }
        
    }

    //*  Method will return sum of divisors:
    public static int sumOfDivisos(int n){
        int sum = 0;
        for(int i = n-1;i>0;i--){
            if(n%i==0){
                // System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
    
}