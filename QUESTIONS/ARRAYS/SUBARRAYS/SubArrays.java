package QUESTIONS.ARRAYS.SUBARRAYS;
// * SUB-ARRAY = continuos part of array == N * (N + 1) / 2
public class SubArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        printSubArrays(arr , 7);
    }
    public static void printSubArrays(int arr[], int N) {
        for (int strtpart = 0; strtpart < N; strtpart++) {  //first loop
            for (int endpart = strtpart; endpart < N; endpart++) { //end part
                for (int i = strtpart; i <= endpart; i++) {  //iterate over end and start part 
                    System.out.print( arr[i] + " , ");
                }
                System.out.println();
            }
        }
    }
}
