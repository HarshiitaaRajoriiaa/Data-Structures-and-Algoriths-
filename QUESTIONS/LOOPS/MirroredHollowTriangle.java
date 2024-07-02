package QUESTIONS.LOOPS;

public class MirroredHollowTriangle {
    public static void main(String[] args) {
        mirroredHollowTri(4);
    }
    public static void mirroredHollowTri(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1 || i==n-1 || i+j==n-1){
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
