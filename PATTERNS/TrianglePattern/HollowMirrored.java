package PATTERNS.TrianglePattern;

public class HollowMirrored {
    public static void main(String[] args) {
        print(4);
    }

    public static void print(int N) {
        for(int i =1 ; i<=N;i++){
            for(int j=i;j<N;j++){
                System.out.print(" ");
            }
            for(int j = 1 ;j<=i;j++){
                if(i==1 || i==N || j==1 || j==i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
