//https://leetcode.com/problems/power-of-three/
public class PowerOf3 {
    public static void main(String[] args) {
        
    }

    //without recursion:
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n%3==0){
            n/=3;
        }
        return (n==1);   
    }
    //with recursion:
    public boolean isPowerOfThree2(int n) {
        return isPower3Helper(n);
    }
    public boolean isPower3Helper(int n){
        if(n<=0) return false;
        if(n==1) return true;
        if(n%3 != 0 ) return false;
        return isPower3Helper( n/3);
    }
    
}
