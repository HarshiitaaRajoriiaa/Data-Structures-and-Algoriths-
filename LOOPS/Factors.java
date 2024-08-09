package LOOPS;

public class Factors {
    public static void main(String[] args) {
        printFactors(12);
    }
    public static void printFactors(int N){
        for(int i=1;i<=N;i++){
            if(N%i==0) System.out.print(i + " ");
        }
    }
}
