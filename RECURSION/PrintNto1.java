//https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/0
public class PrintNto1 {
    public static void main(String[] args) {
        
    }

    // *TC = 0(N)
    public static void print(int n){
        if(n==0){
            System.out.println(" ");
        }
        System.out.println(n);
        print(n-1);
    }
    public static void print2(int n){
        if(n==0){
            System.out.println(" ");
        }
        print2(n-1); // *BACKTRACKING EXAMPLE
        System.out.println(n);
    }

}
