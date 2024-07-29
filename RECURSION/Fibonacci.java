
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3)); //  0,1,1,2,3,5..............
    }
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }

        //another way need only one base case for 0 and 1 cause n=2 will be 1+0=1
        if(n==0 || n==1){
            return n;
        }

        int fn = fib(n-1) + fib(n-2);
        return fn;
    }
}
