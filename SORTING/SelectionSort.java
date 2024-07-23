package SORTING;

public class SelectionSort {
    public static void main(String[] args) {
        
    }
    public static void selectionSort(int arr[]){
        int i = 0;
        while(i <arr.length){
            
        }
    }
    public static int findMinElementIndex(int arr[] , int st , int end){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int arr[], int i1 , int i2){
        int temp= arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
