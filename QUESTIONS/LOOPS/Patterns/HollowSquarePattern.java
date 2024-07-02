package QUESTIONS.LOOPS.Patterns;

public class HollowSquarePattern {
    public static void main(String[] args) {
        hollowSquarePattern(4);
        
    }
    public static void hollowSquarePattern(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
