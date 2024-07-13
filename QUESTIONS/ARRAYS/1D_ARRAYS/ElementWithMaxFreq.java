//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

public class ElementWithMaxFreq {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums1));
    }

    public static int maxFrequencyElements(int[] nums) {
            int n = nums.length;
            int[] frequency = new int[10001]; // Assumption: nums[i] <= 10000
            int max_freq = -1;
            //Step 1 : Create an array having frequencies of element corresponding to index of array.
            for (int i = 0; i < n; i++) {
                frequency[nums[i]]++;
            }
    
            // Step 2: Find the maximum frequency
            int maxFrequency = 0;
            for (int i = 0; i < 10001; i++) {
                if (frequency[i] > maxFrequency) {
                    maxFrequency = frequency[i];
                }
            }
            // Step 3: Sum the frequencies of elements that have the maximum frequency
            int totalMaxFrequencyCount = 0;
            for (int i = 0; i < 10001; i++) {
                if (frequency[i] == maxFrequency) {
                    totalMaxFrequencyCount += frequency[i];
                }
            }
            return totalMaxFrequencyCount;
        }
    }

