package PATTERNS.MiscellaneousStar;

public class OnlyDiagonal {
    public static void main(String[] args) {
        printDiagonal(5);
    }
    public static void printDiagonal(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i==j || j==N-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
