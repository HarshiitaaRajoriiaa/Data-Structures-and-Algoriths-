

import java.util.List;

public class TargetSum {
    public static void main(String[] args) {
        List<Integer> nums = List.of(-1, 1, 2, 3, 1);
        int target = 2;
        System.out.println(countPairs(nums, target)); // Output: 3
    }
    public  static int countPairs(List<Integer> nums, int target) {
        int counter = 0;
        int n = nums.size();
        for(int i = 0 ; i< n ; i++){
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
