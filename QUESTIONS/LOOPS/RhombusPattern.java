package QUESTIONS.LOOPS;

public class RhombusPattern {
    public static void main(String[] args) {
        mirroredRhombus(5);
    }
    public static void rhombus(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n-i-1;j++){     
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println( " " );
        }
        
    }
    public static void mirroredRhombus(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<=i;j++){     
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println( " " );
        }
        
    }

}
