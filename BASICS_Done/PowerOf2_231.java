
// TODO: https://leetcode.com/problems/power-of-two/
public class PowerOf2_231 {
    public static void main(String[] args) {
        System.out.println(powerOf2(27));
    }

    public static boolean powerOf2(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return (n == 1);
    }
}
