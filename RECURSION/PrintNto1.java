//https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/0
public class PrintNto1 {
    public static void main(String[] args) {
        
    }
    public static void print(int n){
        if(n==0){
            System.out.println(" ");
        }

        System.out.println(n);
        print(n-1);
        
    }
}
