package QUESTIONS.LOOPS;

public class MirroredTriangle {
    public static void main(String[] args) {
        mirroredTri(4);
    }
    public static void mirroredTri(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n-i-1;j++){     
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( " " );
        }
    }
}
