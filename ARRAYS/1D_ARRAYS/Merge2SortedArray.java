import java.util.*;
//https://leetcode.com/problems/merge-sorted-array/
public class Merge2SortedArray {
    public static void main(String[] args) {
        
    }
    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        //*TC = 0(m+n) + 0(n+m) ==0(2(n+m)) == 0(n+m).
        //* in total of while loops joint TC= 0(n+m)
        int length = m+n; //given of nums1
        ArrayList<Integer> result = new ArrayList<>();
        int i=0 , j=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                result.add(nums2[j]);
                j++;
            }
            else{
                result.add(nums1[i]);
                i++;
            }
        }
        while(i<m){
            result.add(nums1[i]);
            i++;
        }
        while(j<n){
            result.add(nums2[j]);
            j++;
        } 
        //coping element from array TC = 0( n+m )
        //* TC = 0(n+m)
        for(int k = 0 ; k <length;k++){
            nums1[k] = result.get(k);
        }
    }

}
