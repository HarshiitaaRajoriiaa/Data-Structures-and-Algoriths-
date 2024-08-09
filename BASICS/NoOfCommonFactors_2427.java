package BASICS;
// TODO: https://leetcode.com/problems/number-of-common-factors/
public class NoOfCommonFactors_2427 {
    public static void main(String[] args) {
       System.out.println( commonFactors(20, 40));
        
    }
    public  static int commonFactors(int a, int b) {
        int n = 0 ; 
        for(int i = 1;i<=Math.min(a,b) ; i++){
            if(a%i ==0 && b%i ==0){
                n++;
            }
        } 
        return n;   
    }   
    
}
