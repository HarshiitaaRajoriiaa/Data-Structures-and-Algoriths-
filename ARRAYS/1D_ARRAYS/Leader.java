//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
import java.util.ArrayList;
import java.util.Collections;

public class Leader {
    public static void main(String[] args) {
    }
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        int  max = -1;
        for(int i=n-1 ; i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                result.add(arr[i]);
            } 
        }
        Collections.reverse(result);
        return result;
    }
    
}
