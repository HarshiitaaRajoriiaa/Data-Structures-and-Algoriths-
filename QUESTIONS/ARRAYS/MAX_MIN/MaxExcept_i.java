package QUESTIONS.ARRAYS.MAX_MIN;
import java.util.*;
// * DECRYPTION: given an index find the maximum element of the array excluding the element of that index.
public class MaxExcept_i {
    public static void main(String[] args) {
        
    }
    public static int[] suffixSumArray(int[] arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i] = Math.max(arr[i+1], arr[i]);
        }
        return arr;
    }
    public static int[] prefixSumArray(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i] = Math.max(arr[i-1], arr[i]);
        }
        return arr;
    }
    public static int maxExcept_i(int arr[] , int index){
        if(arr.length==1){
            return -1;
        }
        int before []  = prefixSumArray(arr);
        int after[] = suffixSumArray( arr);
        int maxBefore = (index > 0) ? before[index-1] : Integer.MIN_VALUE;
        int maxAfter = (index < arr.length-1) ? after[index+1] : Integer.MIN_VALUE;
        int element = Math.max(maxBefore, maxAfter);
        return element;
    }
}
