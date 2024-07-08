//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
package QUESTIONS.ARRAYS;

import java.util.ArrayList;

public class Leader {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        ArrayList<Integer> leaders = leaders(n, arr);
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
        
    }

    public static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> arry = new  ArrayList<>();
        int maxFromRight = arr[n - 1];
        arry.add(maxFromRight); //rightmost element is always a leader. 
        
        for (int i = n - 2; i >= 0; i--) {   // *TC=0(N)
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                arry.add(maxFromRight);
            }
        }
        
        // Reverse the list since leaders were added from the end to the beginning
        ArrayList<Integer> result = new  ArrayList<>();   // *TC=0(N)
        for(int i = arry.size() -1 ; i>=0;i--){
            result.add(arry.get(i));
        }
        return result;
    }
    
}
