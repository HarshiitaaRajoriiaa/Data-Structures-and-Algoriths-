package LOOPS;
// ?Write a java program to print Strong numbers between 1 to n.
// Strong number is a special number whose sum of factorial of digits is equal to the original number.
// For example: 145 is strong number. Since, 1! + 4! + 5! = 145,
public class StrongNum {
    public static void main(String[] args) {
        printStrongNum(1000);
    }
    public static void printStrongNum(int N){
        for (int i = 1; i <=N; i++) {
            if(strongNum(i)) System.out.println(i);
        }
    }
   
    public static boolean strongNum(int N) {
        int originalNum = N;  // Store the original number
        int sum = 0;
        while (N > 0) {
            int curr = N % 10;
            sum += factorial(curr);
            N /= 10;
        }
        return (sum == originalNum);  // Compare sum with the original number
    }
    public static int factorial(int N) {
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
}
