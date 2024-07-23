package SORTING;
//https://www.geeksforgeeks.org/problems/insertion-sort/1
//line by line inserting element to the right as needed.
//from index 1 and n-1 we are checking its position and insert it to it's place because arr[0] is always sorted.
// *TC = 0(N2)
// *SC = 0(1)
// * STABLE ALGORITHM.
public class InertionSort {
      //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i = 1 ; i<n;i++){
          //target is to accomdate arr[i] to arr[0]....to arr[i-1].
          int currNum = arr[i] , j = i-1;
          while(j>=0 && arr[j]>currNum ){
              arr[j+1] = arr[j]; //shifting element till we get the placw where arr[j] <= currNum
              j--;
          }
          //j will either -1 or index s.t arr[j] <=currNum
          arr[j+1] = currNum;
      }
  }}
