
//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class ReplaceElement {
    public static void main(String[] args) {
        
    }
    // *TC = 0(n)/ use backloop for solving maximum elements problem.
    public int[] replaceElements1(int[] arr) {
        int n = arr.length;
        int max =-1;
        for(int i=n-1;i>=0;i--){
            int curr = arr[i];
            arr[i] = max; //in first iteration arr[n-1] = -1
            if(curr>max){
                max = curr;
            }
        }
        return arr;
    }



    // *BRUTE-FORCE METHOD:
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if(n==1){
            arr[0] = -1;
            return arr;
        }
        arr[(n)-1] = -1; //Last element to -1
        for(int i = 0 ; i<n-1;i++){
            int replace = maxElement(arr , i+1 , n-1);
            arr[i]=replace;
        }
        
        return arr;
    }
    public static int maxElement(int [] arr , int start , int end){
        int max = -1;
        for(int i=start ;i<=end;i++){
            if(arr[i] > max){
                max =arr[i];
            }
        }
        return max;
    }
}
