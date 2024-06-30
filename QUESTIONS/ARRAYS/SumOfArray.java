package QUESTIONS.ARRAYS;

public class SumOfArray {
    public static void main(String[] args) {
        int a[] = { 1,2,3};
        System.out.println(sumOfArray(a));
        
    }
    public static int sumOfArray(int a[]){
        int sum= 0;
        for(int i=1;i<=a.length ; i++){
            sum += a[i-1];
        }
        return sum;
    }
    
}
