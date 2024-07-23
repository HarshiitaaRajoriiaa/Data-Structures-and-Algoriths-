package SORTING;
//https://www.geeksforgeeks.org/problems/insertion-sort/1
//line by line inserting element to the right as needed.
//from index 1 and n-1 we are checking its position and insert it to it's place because arr[0] is always sorted.
// *TC = 0(N2)
// *SC = 0(1)
// * STABLE ALGORITHM.
public class InertionSort {
    public static void main(String[] args) {
        
    }
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length;i++){
            int currElement = arr[i] ;
            int j = i-1;
            while(j>=0 && arr[j] > currElement){
                arr[j+1] = arr[j];  //shift
            }
            arr[j+1] = currElement;
        }
    }
    
}
