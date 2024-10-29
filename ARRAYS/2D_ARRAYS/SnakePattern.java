import java.util.*;
public class SnakePattern {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        int n = matrix.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // Even row: traverse left to right
                for (int j = 0; j < n; j++) {
                    ans.add(matrix[i][j]);
                }
            } else { // Odd row: traverse right to left
                for (int j = n - 1; j >= 0; j--) {
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }
}
