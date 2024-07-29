package Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {12, 3, 9, 7, 8 , 1 , 2 ,  7 , 5 }; //
        // System.out.println(select(arr, 2));
        
    }
    int  select(int arr[], int i){ //select minimum element of array from subarray [i ,n]{ 
        // code here such that selectionSort() sorts arr[] , will select minimum element from [i to n-1]
        int n = arr.length;
        int min  = Integer.MAX_VALUE;
        int index = -1;
        for(int j = i ; j< arr.length ; j++){
            if(min > arr[j]){
                min = arr[j];
                index= j;
            }
        }
        return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0;i<n-1;i++){
	        int index = select(arr , i);
	        //swap
	        int temp = arr[i];
	        arr[i] = arr[index];
	        arr[index] = temp;
	    }
	    
	}
    
}
