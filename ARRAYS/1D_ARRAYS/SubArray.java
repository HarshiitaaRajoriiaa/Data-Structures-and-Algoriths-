//?https://leetcode.com/problems/shortest-unsorted-continuous-subarray/

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        
    }
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int s = -1 , e = -2;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] != sortedNums[i]){
                if(s == -1){
                    s= i;
                }
                else{
                    e= i;
                }
            }
        
        }
        return e-s+1;
    }
    public int findUnsortedSubarray1(int[] nums) {
        int ind1 = -1, ind2 = -1;
        for(int i=1;i<nums.length;i++) { //got the index of first element from where array is unsorted.
            if(nums[i] < nums[i-1]) {
                ind1 = i-1;
                break;
            }
        }
        for(int i=nums.length-2;i>=0;i--) { //got the index of last element from where array is unsorted.
            if(nums[i] > nums[i+1]) {
                ind2 = i+1;
                break;
            }
        }
        if(ind1 == -1) return 0; 

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=ind1;i<=ind2;i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        while(ind1>=0 && nums[ind1] > min) ind1--;
        while(ind2<nums.length && nums[ind2] < max) ind2++;
        
        return ind2-ind1-1;
    }
}
