package QUESTIONS.ARRAYS;
//https://leetcode.com/problems/subarray-product-less-than-k/description/
public class MaxProductSubArray {
    public static void main(String[] args) {
        
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0 , r=0 , n=nums.length , subarrays = 0 , prod = 1;
        for(;r<n;r++){
            prod *=nums[r];
            while(prod >= k && l <= r ){
                prod /= nums[l];
                l++;
            }
            subarrays += r-l+1;
        }
        return subarrays;
    }
}

/*
 * SLIDING WINDOW APPROACH
 */