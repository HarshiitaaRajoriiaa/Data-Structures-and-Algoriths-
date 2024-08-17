//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
import java.util.ArrayList;
import java.util.Collections;

public class Leader {
    public static void main(String[] args) {
    }
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        int current =-1, max = -1;
        for(int i=n-1 ; i>=0;i--){
            current = arr[i];
            if(current>=max){
                max = current;
                result.add(current);
            } 
        }
        Collections.reverse(result);
        return result;
    }
    
}
