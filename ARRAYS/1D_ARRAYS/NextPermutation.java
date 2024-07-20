public class NextPermutation {
    public static void main(String[] args) {
        
    }

    public void nextPermutationOptimized(int[] nums) {
        // 123897654 
        //nums[i+1] is the value from array is last sorted. 8 is the number after which array is sorted in decreasing order 
        //so the next permutation will be 123945678
        int n=nums.length;
        int ele=-1;
        for(int i=nums.length-2;i>=0;i--){ // *TC = 0(n)
            if(nums[i]<nums[i+1]){
                ele=i;
                break;
            }
        }
        if(ele==-1){
            reverse(nums,0,n-1); //
            // if entire array is sorted with decreasing order than u have to reverse te whole array .
            //54321 next permutation will be 12345.
            return; 
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[ele]){
                swap(nums,i,ele);
                break;
            }
        }
        reverse(nums, ele + 1, n - 1);
    }
    void reverse(int nums[],int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int i = nums.length-2; // second last element of array.
        while(i>=0 && nums[i+1] <= nums[i]){ // 123897654     // *TC (worst case) = 0(N)
            i--; //nums[i+1] is the value from array is last sorted. 8 is the number after which array is sorted in decreasing order 
            //so the next permutation will be 123945678
        }
        if(i>=0) // if there is any number like 8 in the nums
        { int j = nums.length -1; //last element of array 
          //now swap 8 with the number just bigger than 8 which is 9 
          while(nums[j]<=nums[i]){ //depended on above while loop .
            j--;
          }
          swap(nums , i , j); //1239 {87654} // *TC =0(1).
        }

        // if entire array is sorted with decreasing order than u have to reverse te whole array .
        //54321 next permutation will be 12345.
        reverse(nums , i+1); // *TC = 0(N).

    }
    public static void reverse(int arr[] , int start ){  //* TC = 0(N)
        int i = start;
        int j = arr.length-1;
        while(i<j){
            swap( arr , i ,j  );
            i++;
            j--;
        }
    }

    public static void swap( int arr[] , int a , int b){ // *TC = 0(1)
        int temp = arr[a];
        arr[a] =arr[b] ;
        arr[b] =temp;
    }
}

/*  non-optimized one:
Scenario	    Time Complexity per Operation	            Total Time Complexity
Worst-case	    O(n) (outer loop), O(n) (reverse)	        O(n^2)
Average-case	O(n), O(1) (often), O(n) (less frequent)	O(n)
*/
