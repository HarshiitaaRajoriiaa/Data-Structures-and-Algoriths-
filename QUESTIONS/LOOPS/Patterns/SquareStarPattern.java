package QUESTIONS.LOOPS.Patterns;

public class SquareStarPattern {
    public static void main(String[] args) {
        squareStarPattern(4);
        
    }
    public static void squareStarPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }   
    }
}
