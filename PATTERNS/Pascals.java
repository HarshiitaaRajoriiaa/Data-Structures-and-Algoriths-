package PATTERNS;
// * PASCAL'S TRIANGLE:
    //                    1
    //                 1       1
    //             1       2       1
    //         1       3       3       1
    //     1       4       6       4       1
    // 1       5       10      10      5       1

//! type of questions can be asked :
//? 1. print Nth row :
//?  2. print element @ ( r,c) == element at (r,c) == r-1^ [C] c-1 
//?  3. print entire triangle.

public class Pascals {
    public static void main(String[] args) {
        // System.out.println(nCr(4, 2));
        // System.out.println(elementRowCol(5, 3));
        nRow(4);
    }
    // ?print element @ ( r,c) == element at (r,c) == r-1^ [C] c-1 :TC = 0(r)
    public static int elementRowCol(int r , int c){
        return nCr(r-1, c-1);
    }

    public static int nCr(int n , int r){
        int result = 1;
        for(int i=0;i<r;i++){
            result *=(n-i);
            result /=(i+1);
        }
        return result;
    }

    //?print Nth row :
    //* in cth row c element is there 
    // brute force method we knew already element at particular (r,c) so iterating row bu 1 to n we can run a loop. 
    // public static void nRow(int N){ 
    //     for(int c=1;c<=N;c++) {//in nth row n element is there 
    //         System.out.print(nCr(N-1, c-1) + " ");
    //     }
    // } // ! complexity is N*r == unoptimized.
    //todo optimized approach is here.
    // column indexing by 0 to ....n-1 and row indexing by 1 to n.....
    public static void nRow(int N){
        int ans =1;
        System.out.print(ans+" ");
        for(int i =1;i<N;i++){
            ans *= N-i;
            ans /= i;
            System.out.print(ans+ " ");
        }
    }
    //* TC = 0 (N)

    //?print entire triangle.
    public static int[][] pascalTriangle(int N) {
        // Initialize the array
        int arr[][] = new int[N][];
        for(int i = 0; i < N; i++) {
            arr[i] = nRowP(i+1);
        }
        return arr;
    }
    public static int[] nRowP(int row) {
        long ans = 1;
        int ansRow[] = new int[row];
        ansRow[0] = (int) ans; // inserting the 1st element
        // Calculate the rest of the elements:
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow[col] = (int) ans;
        }
        return ansRow;
    }

}
