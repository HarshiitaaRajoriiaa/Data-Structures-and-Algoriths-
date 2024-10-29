
//https://leetcode.com/problems/missing-number/description/
public class MissingNo_268 {
    public static void main(String args[]) {
    }

    // * Brute force method
    // ! TC= 0(N^2)
    public int missing(int[] nums) {
        int n = nums.length;
        int missing_no = -1;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j : nums) {
                if (j == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing_no = i;
                break;
            }
        }
        return missing_no;
    }

    // *Optimzed approach : HashArray
    //! Tc=0(N)
    public int missingNumber(int[] nums) {
        int miss = -1;
        int arr[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                miss = i;
                break;
            }
        }
        return miss;
    }
}
