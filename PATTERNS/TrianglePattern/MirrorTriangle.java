package PATTERNS.TrianglePattern;

public class MirrorTriangle {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int N) {
        int j;
        for (int i = 1; i <= N; i++) {
            for (j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
