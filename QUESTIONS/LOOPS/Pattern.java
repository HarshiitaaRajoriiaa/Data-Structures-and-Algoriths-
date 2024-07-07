package QUESTIONS.LOOPS;

public class Pattern {
    public static void main(String[] args) {
        pyramidstar(3);
    }
    public static void pyramidstar(int n){
        for(int i=0;i<n;i++){
            //spaces:
            for(int j = 0;j<n-1-i;i++){
                System.out.print(" ");
            }
            //star:
            for(int j =0;j<2*n+1;j++){
                System.out.print("*");
            } 
        }
        
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
    public static void tri(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<=i;j++){     
                System.out.print("*");
            }
            System.out.println( " " );
        }
    }
    public static void squareStarPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }   
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
    public static void invertedTri(int n){
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n-i;j++){     
                System.out.print("*");
            }
            System.out.println( " " );
        }
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


