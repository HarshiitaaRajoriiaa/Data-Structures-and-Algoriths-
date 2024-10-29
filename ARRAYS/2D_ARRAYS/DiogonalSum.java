
//?https://leetcode.com/problems/matrix-diagonal-sum/submissions/1437160335/
public class DiogonalSum {
    public static void main(String[] args) {
        
    }
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int m = mat.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==j || (i+j ==m-1)) sum += mat[i][j];
            }
        }
        // if(m==3) sum -= mat[1][1];
        if(m==1) sum = mat[0][0];
        return sum;
    }
}
