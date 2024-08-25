
//?https://leetcode.com/problems/special-positions-in-a-binary-matrix/
public class SpecialPosition {
    public static void main(String[] args) {
        
    }
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for (int i = 0; i < n; i++)
            row[i] = 0;
        for (int j = 0; j < m; j++)
            col[j] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int one =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && row[i] ==1 && col[j] ==1) one++;
            }
        }
        return one;
    }

}
/*
*Approach->
Counting occurrences:
       You initialize two array, row and col, to store the counts for each
	   element in its respective row and column.

Identifying special elements:
        You iterate through the matrix again, checking if an element is present
	    and if its corresponding row and column counts are both equal to 1.

Counting special elements:
        If both conditions are met, the element is considered "special" 
		and you increment  ans variable.

Final result: 
       The function returns the final ans of special elements in the matrix.


*/