package PATTERNS.TrianglePattern;

public class Hollowstar {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int N){
        for(int i=1;i<=N;i++){
            for(int j =1;j<=i;j++){
                if( i==1 || j==1 || j==i || i==N){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
