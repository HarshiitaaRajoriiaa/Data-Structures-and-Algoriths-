package QUESTIONS.ARRAYS;
//https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class SortedOrNot {
    public static void main(String[] args) {
        
    }
    boolean arraySortedOrNot(int[] arr, int n) {
        boolean sorted = true ;
        for( int i = 0 ; i<n-1 ; i++)
        {   if(arr[i] > arr[i+1] )
        {
            sorted = false;
        }
        }
        return sorted;
    }
}
