
import java.util.*;
//?https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/make-it-non-decreasing-7d3391fd/

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  // Number of test cases
        while(t > 0) {
            int l = s.nextInt();  // Length of the array
            int arr[] = new int[l];
            for(int i = 0; i < l; i++) {
                arr[i] = s.nextInt();  // Input array
            }
            int result[] = b(arr, l);
            for(int i = 0; i < l; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            t--;  // Decrement the test case count
        }
        s.close();  // Close the scanner
    }

    // *optimized version:
    //example 
    // 2
    // 3
    // 2 1 3
    // 2
    // 5 1
    public static void optimized( ){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t>0){  // 2
            int n = s.nextInt(); // 3
            long prev = s.nextLong(); 
            sb.append(prev+" ");
            for(int i=1; i<n; i++){
                long curr = s.nextLong();
                curr = curr * ((curr+prev-1)/curr);
                prev = curr;
                sb.append(curr+" ");
            }
            sb.append("\n");
            t--; // Increment the test case count
        }
        System.out.println(sb.toString());
    }
    

    //! not optimized and time limit exceeded:
    //todo b[] = same length , non zero , sorted , sum(b[i]) = minimum ,b[i] % A[i] ==0 , b[] will have greater number than a[]] have
    public static int[] b(int A[], int N) {
        int B[] = new int[N];
        B[0] = A[0];  // Initialize the first element of B

        for(int i = 1; i < N; i++) {
            int f = (int) Math.ceil((double)B[i-1] / A[i]);  // Calculate the multiplier
            B[i] = f * A[i];  // Calculate the ith element of B
        }
        return B;
    }

    
}

