package PATTERNS;

// *****
//  *****
//   *****
//    *****
//     *****
public class TiltedRhombusStar2 {
    public static void main(String[] args) {
        tiltedRhombusstar2(5);
    }

    public static void tiltedRhombusstar2(int N) {
        int i, j;
        for (i = 1; i <= N; i++) {
            /* Print leading spaces */
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= N; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
