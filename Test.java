import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        int nums[] = {1,2,34,5,6};
        reverse(nums);
        
    }
    public static void reverse(int arr[] ){
        int i = 0;
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
