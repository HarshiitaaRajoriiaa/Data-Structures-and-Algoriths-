
//https://leetcode.com/problems/number-of-good-pairs/description/

import java.util.HashMap;

public class NoOfGoodPairs {
    public static void main(String[] args) {
        int nums [] = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
        
    }
    // * Brute force
    //! TC=0(N^2)
    public  static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        int n = nums.length;
        for( int i =0; i< n ; i++)
        {   for( int j =0; j < n ; j++)
            if ( nums[i] == nums[j] && i < j )
            {
                pairs++;
            }
        }
        return pairs;
    }


    // * Optimized 
    //! TC=0(N)
    public int numIdenticalPairs2(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                ans+=hm.get(nums[i]); //adding frequency because the third one @4 can make pair with one @3 and one @0 so overall it is count as three 
                System.out.println(ans);
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
                hm.put(nums[i],1);
        }
        return ans;
    }
    
}
