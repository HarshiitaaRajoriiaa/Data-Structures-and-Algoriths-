package SORTING;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) { 

    }

    class Solution {
        public int[] sortArray(int[] nums) {
            int n = nums.length;
            if (n == 1) {
                return nums;
            }
            int left[] = Arrays.copyOfRange(nums, 0, n / 2); // [0,n/2)]
            int right[] = Arrays.copyOfRange(nums, n / 2, n); // [0,n)
            left = sortArray(left);
            right = sortArray(right);
            return merge2SortedArray(left, right);

        }

        public static int[] merge2SortedArray(int arr1[], int arr2[]) {
            int n1 = arr1.length;
            int n2 = arr2.length;
            int arr[] = new int[n1 + n2];
            int i = 0, j = 0, k = 0;
            while (i < n1 && j < n2) {
                if (arr1[i] > arr2[j]) {
                    arr[k] = arr2[j];
                    j++;
                } else {
                    arr[k] = arr1[i];
                    i++;
                }
                k++;
            }
            while (i < n1) {
                arr[k] = arr1[i];
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = arr2[j];
                j++;
                k++;
            }
            return arr; // returning a array which is output of merging two sorted array
        }
    }
}
