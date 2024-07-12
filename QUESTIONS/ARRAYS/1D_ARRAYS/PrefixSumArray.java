package QUESTIONS.ARRAYS;

import java.util.Vector;

//https://leetcode.com/problems/running-sum-of-1d-array/
// PREFIX SUM ARRAY = array[n] = sum of array[0] - array[n-1].
public class PrefixSumArray {
    public static void main(String[] args) {
        
    }

    // * TC = 0(N)
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
    public static int[] runningSum1(int[] nums) {
        int n = nums.length;
        int [] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        return nums;
    }

}
