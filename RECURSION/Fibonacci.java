

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3)); // 1,1,2,3,5..............
    }
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int fn = fib(n-1) + fib(n-2);
        return fn;
    }
}
