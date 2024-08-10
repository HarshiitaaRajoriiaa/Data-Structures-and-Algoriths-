package PATTERNS.SquarePatterns;

// *****
// ** **
// * * *
// ** **
// *****
public class HollowSquareStar {
    public static void main(String[] args) {
        printHollowSquareStar(5);
    }
    public static void printHollowSquareStar(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i==1 || i==N || j==1 || j==N || i==j || j==(N - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
