package PATTERNS.TrianglePattern;

public class Inverted {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int N){
        for(int i = 1;i<=N;i++){
            for( int j=1; j<=N-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
