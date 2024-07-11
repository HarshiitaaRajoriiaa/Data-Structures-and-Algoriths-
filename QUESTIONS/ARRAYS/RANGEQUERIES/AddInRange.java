package QUESTIONS.ARRAYS.RANGEQUERIES;
import java.util.*;
// *DESCRIPTION:given range = you have to add 1 in between that range and after all the queries return the after array.
public class AddInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int queries = s.nextInt();
    }
   

    // * TC = 0(N*Q).
    public static int[] rangeAdd(int arr[] ,int queries){
        for(int i=1;i<queries;i++){
            Scanner sc = new Scanner(System.in);
            int l = sc.nextInt();
            int r = sc.nextInt();
            arr[l] +=1;
            if(r+1<arr.length){
                arr[r+1] +=1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] +=arr[i-1];
        }
        return arr;
    }
}
