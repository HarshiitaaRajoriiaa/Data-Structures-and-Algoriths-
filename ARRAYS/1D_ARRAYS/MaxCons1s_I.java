
//https://leetcode.com/problems/max-consecutive-ones/
public class MaxCons1s_I {
    public static void main(String[] args) {
        
    }
    public  static int findMaxConsecutiveOnes(int[] nums) {
        int no1 = 0; //track no. of ones
        int max =-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                no1++;
                max=Math.max(no1,max);
            }
            else{
                no1 = 0;
            } 
        }
        return max;
    }
}