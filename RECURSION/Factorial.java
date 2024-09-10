//?https://www.geeksforgeeks.org/problems/factorial5739/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class Factorial {
    //! TC =0(N)
    // *RECURSION 
    static long factorialRecursion(int N){
        // code here
        if(N==1) return N;
        return N*factorialRecursion(N-1);   
    }
    // *BRUTE FORCE 
    //! TC =0(N)
    static long factorialBrute(int N){
        // code here
        long result =1;
        for(long i=1;i<=N;i++){
            result *=i;
        }
        return result;
    }
    
   

}
