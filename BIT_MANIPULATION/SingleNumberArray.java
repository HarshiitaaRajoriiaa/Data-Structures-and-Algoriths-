package BIT_MANIPULATION;
//?https://leetcode.com/problems/single-number/
public class SingleNumberArray {
    public static void main(String[] args) {
        
    }
    public int singleNumber(int[] arr) {
        int n =arr.length;
        int xor =0;
        for(int i =0;i<n;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}
