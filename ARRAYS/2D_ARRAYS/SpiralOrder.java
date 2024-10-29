import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int top = 0, bot = m - 1, left = 0, rigt = n - 1;

        while (top <= bot && left <= rigt) {

            // For moving left to right
            for (int i = left; i <= rigt; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // For moving top to bottom.
            for (int i = top; i <= bot; i++) {
                ans.add(matrix[i][rigt]);
            }
            rigt--;

            // For moving right to left.
            if (top <= bot) {
                for (int i = rigt; i >= left; i--) {
                    ans.add(matrix[bot][i]);
                }
                bot--;
            }

            // For moving bottom to top.
            if (left <= rigt) {
                for (int i = bot; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

}
