package QUESTIONS.ARRAYS;
import java.util.*;
//https://leetcode.com/problems/rotate-array/
public class RotatingArray {
    public static void main(String[] args) {
        
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %=nums.length;
        //temp storing elements:
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = n-k ; i<n;i++){
            temp.add(nums[i]);
        }
        //shifting elements
        for(int i = n -1 ; i>=k;i--){
            nums[i] = nums[i-k];
        }

        //copying elements
        for(int i = 0 ; i<k;i++){
            nums[i] =temp.get(i);
        }
    }
}
