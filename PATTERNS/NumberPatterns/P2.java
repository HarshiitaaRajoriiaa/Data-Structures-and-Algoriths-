package PATTERNS.NumberPatterns;

public class P2 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = N; j<=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    } 

}