package QUESTIONS.ARRAYS;
//https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
public class Smallest2Smallest {
    public static void main(String[] args) {
        
    }
    public  static long[] minAnd2ndMin(long a[], long n)  
    {
        long min = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(a[i] < min){
                 min2= min;
                min  = a[i];
            }
            else if (a[i] < min2 && a[i] > min){
                min2 = a[i];
            }
            
        }
        if (min2 == Long.MAX_VALUE) {
        return new long[]{-1}; // Return -1 since second minimum doesn't exist
        }
        
        long a2[] = { min , min2 };
        return a2;
    }
}
