//https://leetcode.com/problems/range-sum-query-2d-immutable/description/
public class SumOfElements{
    public static void main(String[] args) {
        
    }
    
}
class NumMatrix {
    int prefix_arr [][];
   public NumMatrix(int[][] matrix) {
        int l = matrix.length;
        int b = matrix[0].length;
        prefix_arr = new int[l][b];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                prefix_arr[0][0] = matrix[0][0];
                if (j != 0 && i == 0) {
                    prefix_arr[i][j] = matrix[i][j] + prefix_arr[i][j - 1];
                } else if (i != 0 && j == 0) {
                    prefix_arr[i][j] = prefix_arr[i - 1][j] + matrix[i][j];
                } else if (i != 0 && j != 0) {
                    prefix_arr[i][j] = prefix_arr[i][j - 1] + prefix_arr[i - 1][j] - prefix_arr[i - 1][j - 1] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) { // TC = M*N
        int ans = prefix_arr[row2][col2];
        if (row1 > 0) ans -= prefix_arr[row1 - 1][col2];
        if (col1 > 0) ans -= prefix_arr[row2][col1 - 1];
        if (row1 > 0 && col1 > 0) ans += prefix_arr[row1 - 1][col1 - 1];
        return ans;
    }
}