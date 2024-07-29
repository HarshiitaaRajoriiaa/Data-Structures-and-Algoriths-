package Algorithms;
import java.util.*;
import java.util.function.Function;
public class QuickSort{
    public static void main(String[] args) {
        int arr[] = {12, 18, 16, 1, 9, 10, 2, 4, 0, 3, 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[], int l, int r)
    {
        // code here
        if(l>= r){ //either one element or no element
            return;
        }
        int pivot = partition( arr,  l,  r);
        quickSort(arr,l, pivot-1 );
        quickSort(arr, pivot+1 ,r);
    }

/*  
TODO: approach is to pick any random element of array call it PIVOT.
TODO :divide the array on basic of array put smaller < PIVOT in the left and greater > PIVOT in the right. and recursively call function in the both halves.
*/
    // *Time Complexity = 0(N)
    public static int partition(int arr[], int l, int r)
    {
        // your code here
        // int n = arr.length;
        ArrayList<Integer> small =  new ArrayList<>();
        ArrayList<Integer> big =  new ArrayList<>();
        int pivot = arr[r]; // r = n-1;
        for(int i = l; i < r; i++) {
            if(arr[i] <= pivot) {
                small.add(arr[i]); // Corrected to add elements to the list
            }
            else {
                big.add(arr[i]); // Corrected to add elements to the list
            }
        }
        int j = l;//0
        for(int i = 0; i < small.size(); i++) {
            arr[j] = small.get(i);
            j++;
        }
        arr[j] = pivot;
        int index = j;
        j++;
        for(int i = 0; i < big.size(); i++) {
            arr[j] = big.get(i);
            j++;
        }
        return index;
    } 
}



/* 
* BEST CASE : pivot element divide array in two equal parts and index(pivot) = mid. and we have to recursively call partition(arr) in both the halves.
*             TC = N(partition) + 2*TC(N/2)(recursive calls) == NlogN.
* WORST CASE: always pivot element is greater element of array or smaller element of array than
*             TC = N(partition) + TC(N-1)every recursive call will be of 0(N) time which lead to TC = 0(N^2) 
* AVERAGE CASE: fix pivot element / with the index may be one may be last may be middle
*               TC(N) = TC(K) + TC(N-K) + N(partition) / here K is position of Pivot element. == NlogN.
*/