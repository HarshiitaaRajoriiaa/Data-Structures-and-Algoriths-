
//https://leetcode.com/problems/range-sum-query-immutable/description/

public class RangeSumArray {
    
}

class NumArray {  // * TC = 0(K+N).
    int prefixSum[];
    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n];
        // prefixSum[0] = nums[0];
        for(int i = 0; i< n;i++){
            prefixSum[i] = i==0? nums[0]: prefixSum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
            return prefixSum[right];
        
        return  prefixSum[right] - prefixSum[left-1];
        
    }
}
/*
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * can be calculated like prefixSumArray[right-1] + arr[right] -arr[left-1]
 */
