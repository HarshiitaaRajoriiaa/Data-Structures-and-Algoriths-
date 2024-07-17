
//https://www.geeksforgeeks.org/problems/key-pair5616/1
public class ElementPair {
    public static void main(String[] args) {
        
    }
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        boolean result = false;
        int n = arr.length;
        // int one = 0;
        int freq_arr [] = new int[1000001]; 
         
        for(int i = 0 ; i<n ; i++){
            int index = arr[i];
            int to_search = x -arr[i];
            
            
            if(to_search <=1000001  &&  to_search > 0 &&   freq_arr[to_search] == 1){
                result = true;
            }
            freq_arr[index]++;
        }
        return result;
    }
} 

