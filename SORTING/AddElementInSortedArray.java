
import java.util.Arrays;

public class AddElementInSortedArray {
    public static void main(String[] args) {
        
    }
    public static void addElementInSortedArray(int arr[] , int element){
        int n = arr.length;
        int arr2 [] = Arrays.copyOf(arr, n+1);
        arr2[n] = element;
        for(int i = n ; i>=0;i++){
            if(arr[i] < arr[i-1]){
                swap(arr2 , i , i-1);
            }
            else{
                break;
            }
        }


    }
    public static void swap(int arr[], int i1 , int i2){
        int temp= arr[i1];
        arr[i2] = arr[i1];
        arr[i1] = temp;
    }
}
