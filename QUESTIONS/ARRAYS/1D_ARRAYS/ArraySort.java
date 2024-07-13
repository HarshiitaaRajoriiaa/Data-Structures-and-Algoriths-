
//https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
public class ArraySort {
    public static void main(String[] args) {
        int a[] = { 1,2,3};
        System.out.println(arraySortedOrNot(a , 3));
    }
    public  static boolean arraySortedOrNot(int[] arr, int n) {
        boolean result=true;
        for(int i =0 ; i<n-1;i++){
            if( arr[i] > arr[i+1]){
                result=false;
                break;
            }
        }
        return result;
        
    }
}
