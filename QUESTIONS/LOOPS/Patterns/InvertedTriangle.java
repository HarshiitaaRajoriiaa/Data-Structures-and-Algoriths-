package QUESTIONS.LOOPS.Patterns;

public class InvertedTriangle {
    public static void main(String[] args) {
        invertedTri(5);
    }
    public static void invertedTri(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n-i;j++){     
                System.out.print("*");
            }
            System.out.println( " " );
        }
    }
}
