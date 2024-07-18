//https://leetcode.com/problems/power-of-two/
public class PowerOf2 {
    public static void main(String[] args) {
        
    }
    public static boolean power2(int n){  // *Tc  = 0(N) 
        if(n==0){
            return false;
        }
        if(n==1){
            return true; // 2^0
        }
        while(n%2==0){
            n /=2;
        }
        return (n==1);
    }

    //with recursion:
    public boolean isPowerOfTwo2(int n) { // *TC = log(N) , SC = Log(N)
        return helper(n);
    }  
    public boolean helper(int n){
        if(n<=0) return false;
        if(n==1) return true;
        if(n%2 !=0) return false;
        return helper(n/2); 
    }

}
