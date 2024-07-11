package QUESTIONS.ARRAYS;
import java.util.*;
//https://leetcode.com/problems/rotate-array/
public class RotatingArray {
    public static void main(String[] args) {
        
    }

    // * TC = 0(N)/ GOOD APPROACH.
    public void rotateOptimized(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k is greater than the length of the array
        // Reverse the entire array
        reverse(nums, 0, n - 1); //0(N)
        // Reverse the first k elements
        reverse(nums, 0, k - 1); // 0(K)
        // Reverse the remaining n - k elements
        reverse(nums, k, n - 1); // 0(N-K)
    }
    
    // Helper method to reverse a portion of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    // *TC = 
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %=nums.length;
        //temp storing elements:
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = n-k ; i<n;i++){ //0(K)
            temp.add(nums[i]);
        }
        //shifting elements
        for(int i = n -1 ; i>=k;i--){ // 0(N)
            nums[i] = nums[i-k];
        }

        //copying elements
        for(int i = 0 ; i<k;i++){ //0(K)
            nums[i] =temp.get(i);
        }
    }
}
