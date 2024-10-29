

public class Mul {
    public static void main(String[] args) {
        
    }
    public static void multiplyMatrix(int arr1[][] , int arr2[][]) {
        //arr1 = A*B
        //arr2 = B*C
        int A = 2 , C = 3 , B =4 ;
                
                int mul[][] =  new int[A] [C] ;
                for(int  i = 0 ; i < A ; i ++){
                     for(int  j = 0 ; j < C ; j ++){
                         for(int  k = 0 ;k < B ; k ++){
                             int curr = 0 ; 
                             curr += arr1[i][k]*arr2[k][j];
                              mul[i][j] = curr;
                         }
                     }
                }
            }
}
