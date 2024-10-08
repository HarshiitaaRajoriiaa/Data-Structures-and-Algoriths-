//?https://leetcode.com/problems/fibonacci-number/

import java.util.Arrays;

public class Fibonacci{
    public static void main(String[] args) {
        
    }
      
    // *using recursion: 0 1 1 2 3 5 8 13 ......
    //! TC =0(2^N)
    public static int fibR(int n){
        if(n<=1) return n;
        return fibR(n-1)+fibR(n-2);
    }
    //using recursion: TC = Sum(number recursive calls in every iteration or every level of recursion tree which 2^0 2^1 2^2 ......2^n-1) by solving gp TC  = 0(2^n) approximated

    // *using DP: storing values of recursive calls and using them again when needed.
    //todo using TOP DOWN APPROACH = recursion with memoization.
    //!TC =0(2N) , SC =0(N)
    public int fib(int n) {
        if(n<=1) return n;
        int fibA[] = new int[n+1];
        Arrays.fill(fibA , -1);
        if(fibA[n] != -1) return fibA[n];
        else  fibA[n] = fib(n-1) + fib(n-2);
        return fibA[n];
    }

    //todo iterative DP:
    //! TC =0(N) , SC = 0(N)
    public static  int fibI(int N){
        if(N<=1) return N;
        int fib[] = new int[N+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2;i<=N;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[N];
    }
}