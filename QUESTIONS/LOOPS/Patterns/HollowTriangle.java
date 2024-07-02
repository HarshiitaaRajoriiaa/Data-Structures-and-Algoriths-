package QUESTIONS.LOOPS.Patterns;

public class HollowTriangle {
    public static void main(String[] args) {
        hollowTri(5);
    }
    public static void hollowTri(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<=i;j++){     
                if(j==0 || i==j || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println( " " );
        }
    }
}
