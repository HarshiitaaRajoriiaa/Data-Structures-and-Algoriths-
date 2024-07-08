//https://www.codechef.com/problems/MAXCOUNT
package QUESTIONS.ARRAYS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
            countMaximum2(length, arr);
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
    public static void countMaximum2(int n, int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>(); //HASHMAP DECLARATION AND FORMATION
        
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        
        int maxFreq = -1;
        int element = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if (value > maxFreq || (value == maxFreq && key < element)) {
                maxFreq = value;
                element = key;
            }
        }
        
        System.out.println(element + " " + maxFreq);
    }

}
