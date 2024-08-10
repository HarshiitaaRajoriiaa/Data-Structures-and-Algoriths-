package PATTERNS.SquarePatterns;

//     *****
//    *****
//   *****
//  *****
// *****
public class TiltedRhombusstar {
    public static void main(String[] args) {
        tiltedRhombusstar(5);;
    }

    public static void tiltedRhombusstar(int N) {
        int j;
        for (int i = 1; i <= N; i++) {
            for (j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            /* Print stars after spaces */
            for (j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
