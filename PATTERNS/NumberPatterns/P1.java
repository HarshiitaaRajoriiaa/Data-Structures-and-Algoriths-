package PATTERNS.NumberPatterns;

public class P1{
    public static void main(String[] args) {
        print(4);
    }
    public static void print(int N){
        for (int i = 1; i <=N; i++) {
            for (int j = 1; j <=N; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
