package QUESTIONS.ARRAYS.MAX_MIN;
//https://leetcode.com/problems/max-consecutive-ones-iii/
public class MaxCons1s_III {
    public static void main(String[] args) {
        
    }
    public int longestOnes(int[] nums, int k) {
        //left and right to maintain window size
        int window = 0;
        int l = 0; //left 
        int zero_count = 0; //no(0) in the window
        for(int r=0;r<nums.length;r++){  //*TC = 0(N)
            if(nums[r]==0){
                zero_count++; 
                while(zero_count>k){ // * DOUBT!!!!!!
                    if(nums[l]==0){
                        zero_count--;
                    }
                    l++;
                }
            }
            window = Math.max(window , r-l+1);
            
        }
        return window;
    }

}
/*
 * VARIABLE SLIDING WINDOW APPROACH : maintain a window of size r-l+1 if no(0) inside the window exceed K then reduce the size of window until no(0)<=K
 * and have the counter variable to record the maximum size of window having 1's and 0's with valid condition then have max(curr_window , max_window)
 */