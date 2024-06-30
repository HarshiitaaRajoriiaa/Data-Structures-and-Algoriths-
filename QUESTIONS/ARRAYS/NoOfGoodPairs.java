package QUESTIONS.ARRAYS;

public class NoOfGoodPairs {
    public static void main(String[] args) {
        int nums [] = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
        
    }
    public  static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        int n = nums.length;
        for( int i =0; i< n ; i++)
        {   for( int j =0; j < n ; j++)
            if ( nums[i] == nums[j] && i < j )
            {
                pairs++;
            }
        }
        return pairs;
    }
    
}
