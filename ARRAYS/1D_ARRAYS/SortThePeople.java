//https://leetcode.com/problems/sort-the-people/
public class SortThePeople{
    public static void main(String[] args) {
        int arr[] = {1,23,4,5};
        System.out.println(indexMax(arr, 0, 3));

        
    }
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

       // Sort height in descending order
       for (int st = 0; st < n; st++) {
           int maxIndex = indexMax(heights, st, n);
           // Swap heights
           swap(heights, st, maxIndex);
           // Swap names accordingly
           swap(names, st, maxIndex);
       }

       return names;
   }
   // Find index of the maximum element in the array from index st to length
   public static int indexMax(int[] arr, int st, int length) {
       int maxIndex = st;
       int max = arr[st];
       for (int i = st; i < length; i++) {
           if (arr[i] > max) {
               max = arr[i];
               maxIndex = i;
           }
       }
       return maxIndex;
   }

   // Swap elements in the array at index1 and index2
   public static void swap(int[] arr, int index1, int index2) {
       int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;
   }

   // Swap elements in the array at index1 and index2 (for String array)
   public static void swap(String[] arr, int index1, int index2) {
       String temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;
   }
}
