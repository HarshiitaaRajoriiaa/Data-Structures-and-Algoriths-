//https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1
public class Print1toN {
    public static void main(String[] args) {
        
    }
    public static void print(int n){
        if(n==0){
            System.out.println(" ");
        }
        
        //backtracking:
        print(n-1);
        System.out.println(n);
        
    }
}
