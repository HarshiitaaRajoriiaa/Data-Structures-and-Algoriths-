
import java.util.*;
import java.util.ArrayList;
//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class SubArrayWithMaxSum {
    public static void main(String[] args) {
        
    }
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long max_sum = 0;
        long curr_sum = 0;
        
        // Sum of the first sub array of size K
        for (int i = 0; i < K; i++) { // [0, K-1]
            curr_sum += Arr.get(i); // Add elements to curr_sum
        }   // TC = O(K)
        max_sum = curr_sum; // Initialize max_sum with the sum of the first sub array
        // Sliding window approach
        for (int start = 1, end = K; end < N; start++, end++) {  // TC = O(N-K)
            curr_sum = curr_sum - Arr.get(start - 1) + Arr.get(end);
            max_sum = Math.max(max_sum, curr_sum);
        }
        
        return max_sum;
    }

}

/*
* BRUTE FORCE METHOD:
 * no of sub array = N-K+1
 * per sub array TC for have sum  = 0(K)
 * overall TC = (N-K+1)*K == N*K + K^2 + K == N*K.
  
 * DESIRED TC = 0(N)/ Sliding window Concept:
 * curr_sum = curr_sum - Arr.get(start - 1) + Arr.get(end);
 */

 /*
  * In the algorithm, the curr_sum is reset to 0 when it becomes negative because a negative sum would decrease the overall sum of any future sub array.
  */