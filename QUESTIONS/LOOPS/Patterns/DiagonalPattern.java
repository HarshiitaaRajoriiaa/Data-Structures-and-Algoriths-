package QUESTIONS.LOOPS.Patterns;

public class DiagonalPattern {
    public static void main(String[] args) {
        diagonalPattern(5);
        
    }
    public static void diagonalPattern(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1 || i==n-1 || i==j || i+j== n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }    
    }
}
