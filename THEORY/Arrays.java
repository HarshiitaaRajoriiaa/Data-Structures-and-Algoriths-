package THEORY;
public class Arrays{
    public static void main(String[] args) {
        System.out.println("hello from arrays");
    }
}

/*
some important things to remember about java.arrays



*********************1-D ARRAYS:***************************
1. Array.sort() 
2. toString()
3. Array.fill(name , value)
4.  toCharArray() //String to array with elements as single single character of string
5. Arrays.equals() //check the elements only
6. Arrays.copyOf() //only elements not address reference
7. Integer.MAX_VALUE(); , Long.MAX_VALUE(); , Double.MAX_VALUE();
8. Integer.MIN_VALUE()
9. return new Pair(,)
10. Number of SubArrays of Array of size K = (N-K+1).




*********************MULTIDIMENSIONAL ARRAYS:***************************
10. array[0].length = length/no. of  columns if symmetric matrix
11. if jagged arrays ( array[1].length , array[2].length) if unsymmetric matrix
12. array.length = no of rows
13. main diagonal = n(row) = n(col)
14. second diagonal = n(row) + n(col) = length of array - 1 = array.length - 1 ( if starting from 0 index)
15. matrix multiplication = matmulA*B[i][j] =  sum(rowA[i]*colB[j])
 */

 /*
  * Array list:
  1. arraylist.add() : add at the end
  2. arraylist.add(position, element) : add at specific position.
  */