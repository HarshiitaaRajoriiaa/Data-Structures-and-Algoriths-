package LOOPS;

public class SumOfOddInRange {
    public static void main(String[] args) {
        System.out.println(oddSum(10));
    }
    public static int oddSum(int N ){
        int sum =0;
        for (int i = 1; i <=N ;i++) {
            if(i%2!=0) {
                sum+=i;
            }
        }
        return sum;
    }
}
