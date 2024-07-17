
import java.util.*;
//
public class PrefixMaxArray {
    public static void main(String[] args) {
        int arr[] = {1,2,36,9,10 ,1,4};
        System.out.println(prefixMaxArray(arr));
        
    }
    public static int[] prefixMaxArray(int [] arr){
        for(int  i =1;i<arr.length;i++){
            arr[i] = Math.max(arr[i], arr[i-1]);
        }
        return arr;
    }
}
