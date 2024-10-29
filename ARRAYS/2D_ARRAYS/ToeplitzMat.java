//?https://leetcode.com/problems/toeplitz-matrix/
public class ToeplitzMat{
    public static void main(String[] args) {
        
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean ans = true;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 1 ; i <m;i++){
            for(int j = 1 ; j <n;j++){
                if(matrix[i][j] != matrix[i-1][j-1]) ans = false;
            }
        }
        return ans;
    }
}