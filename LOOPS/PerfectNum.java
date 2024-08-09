package LOOPS;
// ? Write a java program to find all Perfect numbers in a given range.
// Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

// For example: 6 is the first perfect number
// Proper divisors of 6 are 1, 2, 3
// Sum of its proper divisors = 1 + 2 + 3 = 6.
// Hence 6 is a perfect number.
public class PerfectNum {
    public static void main(String[] args) {
        System.out.println(countPerfectNum(100));
    }
    public static int countPerfectNum(int N ){
        int count =0;
        for (int i = 1; i < N; i++) {
            if(perfectNum(i)) count++;
        }
        return count;
    }
    public static boolean perfectNum(int N){
        int sum=0;
        for (int i = 1; i <N; i++) {
            if(N%i==0) sum +=i;
        }
        return (sum==N);
    }
}
