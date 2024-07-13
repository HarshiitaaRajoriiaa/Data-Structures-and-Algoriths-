
//https://leetcode.com/problems/maximum-difference-between-increasing-elements/
public class MaxDiff {
    public static void main(String[] args) {
        
    }
    public int maximumDifference(int[] nums) { // *TC = 0(N)!
        int min  = nums[0] ;//min value from arr[0]- arr[j-1]
        int max_diff = -1; //maximum diff to be maintained.
        int n = nums.length;
        for(int j= 1;j<n;j++){
            min = Math.min(min , nums[j]); //minimum element from arr[0]- arr[j-1]
            if( nums[j] > min ){ //nums[j] - nums[i] should always be true
                max_diff = Math.max(nums[j] - min , max_diff);
            }
        }
        return max_diff;
    }
}

/*
 * APPROACH: consider current element to be j and from the arr[0] to arr[j-1] have the smallest to find the maximum difference.
 */



 