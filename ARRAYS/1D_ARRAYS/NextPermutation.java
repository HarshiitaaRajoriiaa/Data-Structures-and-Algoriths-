public class NextPermutation {
    public static void main(String[] args) {
        
    }
    public void nextPermutation(int[] nums) {
        int i = nums.length-2; // second last element of array.
        while(i>=0 && nums[i+1] <= nums[i]){ // 123897654 
            i--; //nums[i+1] is the value from array is last sorted. 8 is the number after which array is sorted in decreaing order 
            //so the next permutation will be 123945678
        }
        if(i>=0) // if there is anynumber like 8 in the nums
        { int j = nums.length -1; //last element of array 
          //now swap 8 with the number just bigger than 8 which is 9 
          while(nums[j]<=nums[i]){
            j--;
          }
          swap(nums , i , j); //1239 {87654}
        }

        // if entire array is sorted with decreasing order than u have to reverse te whole array .
        //54321 next permuation will be 12345.
        reverse(nums , i+1);

    }
    public static void reverse(int arr[] , int start ){
        int i = start;
        int j = arr.length-1;
        while(i<j){
            swap( arr , i ,j  );
            i++;
            j--;
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + " ");
        }
    }
    public static void swap( int arr[] , int a , int b){
        int temp = arr[a];
        arr[a] =arr[b] ;
        arr[b] =temp;
    }
}
