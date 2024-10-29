
//?https://leetcode.com/problems/transpose-matrix/
public class Transpose {
    public static void main(String[] args) {
        
    }
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] =new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[j][i]; 
            }
        }
        return ans;
    }
}
