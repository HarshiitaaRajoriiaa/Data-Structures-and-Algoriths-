import java.util.*;
public class PlusOne {
    //?https://leetcode.com/problems/plus-one/
    public static void main(String[] args) {
        
    }
    public int[] plusOne(int[] digits) {
        int n  = digits.length;
        for(int i = n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        //handling 999 
        int arr[] = new int[n+1];
        Arrays.fill(arr , 0);
        arr[0]=1;
        return arr;

    }
}
