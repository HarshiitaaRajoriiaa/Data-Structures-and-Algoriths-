package QUESTIONS.ARRAYS;
// * SUB-ARRAY = continuos part of array == N * (N + 1) / 2
public class SubArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        printSubArray(arr);
    }
    public static void printSubArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print("(" + arr[i] + " , "+ arr[j]+ ")");
            }
           } 
        }
    }
}
