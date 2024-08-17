//https://www.codechef.com/problems/MAXCOUNT
import java.util.ArrayList;
import java.util.Scanner;

public class MaxFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int testcase = s.nextInt();

		for(int i = 1;i<=testcase;i++){ // number of test cases by user as input 
            System.out.println("testcase" + i );
		    int length = s.nextInt();
            int arr [] = new int[length]; //array of length input by user

            for(int j=0;j<length;j++){
                System.out.println("enter element for array " + i + " st");
                int element = s.nextInt();
                arr[j] = element;
            }

            countMaximum1(length, arr);
            maxOccured( arr , length);
        }
        s.close();
    }
    // *BRUTEFORCE METHOD:
    public static void countMaximum1(int n , int arr[]){
	    int maxfreq = Integer.MIN_VALUE;;
	    int element = Integer.MAX_VALUE;;
	    for(int i=0;i<n;i++){ //accessing element one by one
	        int curr = 0 ;

	        for(int j= 0;j<n;j++){  //compare
	          if(arr[i]==arr[j]){
	              curr++;
	              if(curr>maxfreq || (curr == maxfreq && arr[i] < element)){
	                  maxfreq=curr;
	                  element = arr[i];
	              }
	          }
	        }
	    }
        System.out.println( element + " " + maxfreq);
	}

    // *HASHMAP METHOD:
    public static int[] maxOccured(int arr[], int n) {
        int freq[] = new int[100000 + 1];
        // Count the frequency of each element in the array
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        // Find the element with the maximum frequency
        int max = -1;
        int element = -1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                element = i;
            }
        }
        return new int[] {element, max};
    }
}
