//?https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
public class RowWithMaxOne {
    public static void main(String[] args) {
        
    }
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max =0;
        int index =-1;
        for(int i=0;i<arr.length;i++){
            int one =0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1)  one++;
            }
            if(one > max ) {
                max = one;
                index = i;
            }
           
        }
        return  index;
    }
}
