package QuestionsFromPlatforms.CodeForces;
import java.util.Scanner;
import java.util.Scanner.*;
public class OddOneOut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  // Read number of test cases
        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            System.out.println(oddOneOut(a, b, c));
        }
        s.close();
    }
    public static int oddOneOut(int a, int b, int c) {
        if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else {
            return b;
        }
    }
    
}
