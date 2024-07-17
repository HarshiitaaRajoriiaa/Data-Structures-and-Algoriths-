//https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75
public class ProductOfArray_ExceptSelf{
    public static void main(String[] args) {
        
    }
    public int[] productExceptSelfOptimal(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];


         // Step 1: Calculate prefix products and store them in the output array
        output[0] = 1;  // The first element has no left elements
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= suffixProduct;  // Multiply with the suffix product
            suffixProduct *= nums[i];  // Update the suffix product
        }
        return output;
    }


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];
        
        // Initialize the prefix and suffix arrays
        prefix[0] = nums[0];
        suffix[n - 1] = nums[n - 1];
        
        // Calculate the prefix products
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }
        
        // Calculate the suffix products
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }
        
        // Construct the result array
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = suffix[i + 1];
            } else if (i == n - 1) {
                result[i] = prefix[i - 1];
            } else {
                result[i] = prefix[i - 1] * suffix[i + 1];
            }
        }
        
        return result;
    }
}