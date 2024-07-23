package SORTING;

public class BubbleSort {
    public static void main(String[] args) {
        
    }
    public static void BubbleSort(int arr[]){
        int n = arr.length;
        int j = n-1;
        
        for(int i = 0 ; i < j;i++){
            if(arr[i] > arr[i+1]){
                swap(arr, i, i+1);
            }
        }
    }
    public static void swap(int arr[], int i1 , int i2){
        int temp= arr[i1];
        arr[i2] = arr[i1];
        arr[i1] = temp;
    }
}
