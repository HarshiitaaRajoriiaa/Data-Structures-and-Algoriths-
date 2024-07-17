
import java.util.Arrays;

//https://leetcode.com/problems/minimum-number-game/description/
public class Game {
    public static void main(String[] args) {
        int[] nums1 = {5, 4, 2, 3};
        int[] result1 = numberGame(nums1);
        System.out.println(Arrays.toString(result1));  // Output: [3, 2, 5, 4]
    }
    public static int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int resultIndex = 0;
        Arrays.sort(nums);

        // Two pointers to keep track of the elements being removed
        int left = 0;

        // Game logic: remove minimum element from array  and append to result:
        while(left<nums.length){
            // Alice's move
            int aliceMin = nums[left];
            left++;
        
            // Bob's move
            int bobMin = nums[left];
            left++;

            // Bob appends first, then Alice
            result[resultIndex++] = bobMin;
            result[resultIndex++] = aliceMin;
        }
        return result;
    }    
}
