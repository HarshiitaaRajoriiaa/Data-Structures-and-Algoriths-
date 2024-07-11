package QUESTIONS.ARRAYS;
//https://leetcode.com/problems/maximum-subarray/description/
public class MaxSumSubAray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int curr_sum= 0 ;
        int max_sum = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            curr_sum +=nums[i];
            max_sum = Math.max(curr_sum , max_sum);
            if(curr_sum <= 0){
                curr_sum =0;
            }
        }
        return max_sum;
    }
}
// * TC = 0(N) , SC = 0(1).
/*
 * Approach:
 * go with the flow in the direction of arr[0] ....arr[n], if you encounter arr[i] > 0 fill your bag with the element 
 * and maintain a max variable which have count of  max sum of elements in the bag  
 * if arr[i] < 0 , then  calculate if having that in your bag makes sum of elements = 0 or >0 if yes then have it in your bag but keep maintaining maximum sum of elements bag have
 * if arr[i] makes sum of elements < 0 , then leave it there and start from the other elements while leaving all the elements behind.
 */
