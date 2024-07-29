package Algorithms;
import java.util.*;
public class QuickSort{
    public static void main(String[] args) {
        int arr[] = {12, 18, 16, 1, 9, 10, 2, 4, 0, 3, 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[] , int start , int end){
        int pivot = partition(arr);
        start = 0;
         end = arr.length;
        quickSort(arr ,  start , pivot-1);
        quickSort(arr, pivot+1, end);
    }




/*  
TODO: approach is to pick any random element of array call it PIVOT.
TODO :divide the array on basic of array put smaller < PIVOT in the left and greater > PIVOT in the right. and recursively call function in the both halves.
*/
    // *Time Complexity = 0(N)
    public static  int  partition(int arr[] ){ 
        int n = arr.length;
        ArrayList<Integer> small =  new ArrayList<>();
        ArrayList<Integer> big =  new ArrayList<>();
        int Pivot = arr[n-1];

        // * TC =0(N)
        // ? iterAte over second last element only. 
        for(int i = 0 ; i<n-1;i++){  
            if(arr[i] <= Pivot){ // ?smaller and equal ones in the small.
                small.add(arr[i]);
            }
            if(arr[i]>Pivot){ //? greater one are in the big.
                big.add(arr[i]);
            }
        }

        int  n1 = small.size();
        int n2 = big.size();
        // *TC = 0(small.size() ===  N )
        for(int i = 0 ; i<n1;i++){ //? copying small in the array back again.
            arr[i] = small.get(i);
        }

        //?putting pivot in its original place.
        arr[small.size()] = Pivot; 

        // *Time Complexity = 0(big.size() == N )
        //? copying small in the array back again.
        int j = 0;
        for(int i = n1+1 ; i < n;i++){ 
            arr[i] = big.get(j);
            j++;
        }

        
        return small.size();
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