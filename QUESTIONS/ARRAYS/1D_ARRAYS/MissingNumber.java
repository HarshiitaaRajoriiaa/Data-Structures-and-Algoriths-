package QUESTIONS.ARRAYS;
//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        
    }
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int missing_no = -1;
        for(int i=0; i <= n ; i++){
         boolean found = false;
         for( int j :  nums){
            if(j == i ){
                found = true;
                break;
            }
         }
         if(!found){
            missing_no = i ;
            break;
         }
        }
        return missing_no;
    }
}
 //time complexity : " O(n^2) "   / [2*10^8 = 1 seconds]
