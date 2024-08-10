package PATTERNS.PyramidPattern;

public class HollowInverted {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int N){
        for(int i=1;i<=N;i++){
            // *spaces:
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<= (2*N - (2*i-1)); j++){
                if(i==1 ||i==N || j==1 || j==(2*N - (2*i - 1))) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
