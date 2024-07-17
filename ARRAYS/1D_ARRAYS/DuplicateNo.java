//https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNo {
    public static void main(String[] args) {
        
    }
    public int findDuplicate(int[] nums) {
        // int answer = 0 ; 
        int freq[] = new int[100001];
        int index = 0 ; 
        int n = nums.length;
        for(int i = 0 ;  i < n ; i ++){
            freq[nums[i]]++;
        }
        int m = freq.length;
        for(int i = 0 ;  i < m ; i ++){
            if(freq[i] > 1){
                return  i;
            }
        }
        return -1;
    }
}
