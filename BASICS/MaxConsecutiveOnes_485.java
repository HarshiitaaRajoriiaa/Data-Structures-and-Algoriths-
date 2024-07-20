package BASICS;
//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOnes_485{
    public static void main(String[] args) {
        System.out.println();
        int n[] = {1,1,0,1,1,1};
         int sol = findMaxConsecutiveOnes(n);
         System.out.println(sol);

    }

    public static int findMaxConsecutiveOnes(int [] nums){
        int n= nums.length;
        int max = 0;
        int nofconsecutive1s = 0 ;
        for(int element= 0 ; element <n ; element++){
            if(nums[element]==1){
                nofconsecutive1s++;
                if(nofconsecutive1s > max){
                    max = nofconsecutive1s;
                }
            }
            else{
                nofconsecutive1s = 0;
            }
        }
        return max;   
    }
}

// * NOTE:
/*
 * need to have little practice of visualization of loops
 */