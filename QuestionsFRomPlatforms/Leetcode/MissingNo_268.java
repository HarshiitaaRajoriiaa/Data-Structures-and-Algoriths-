package QuestionsFromPlatforms.Leetcode;

public class MissingNo_268 {
    public static void main(String args[]){
    }
    public int missing(int[] nums) {
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
