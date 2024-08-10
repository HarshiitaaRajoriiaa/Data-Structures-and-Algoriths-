package PATTERNS.PyramidPattern;

public class Inverted {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int N){
        for(int i=1;i<=N;i++){
            // *spaces:
            for(int j=0;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1; j<= (2*N - (2*i-1)); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
