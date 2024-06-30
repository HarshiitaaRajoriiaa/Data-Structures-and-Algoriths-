package QuestionsFromPlatforms.GFG;

public class MinMax {
   public static void main(String[] args) {
    int a[]= {1,2,3 ,-1};
    System.out.println(findSum(a, 4));
    
   } 
   public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        for(int i =0 ;i< N; i++){
            if(A[i]>max){
                max =A[i];
            }
            if(A[i]<min){
                min = A[i];
            }
        }
        sum = min+max;
        return sum;
    }
}
