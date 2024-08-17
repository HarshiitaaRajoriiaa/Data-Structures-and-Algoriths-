package PATTERNS.MiscellaneousStar;

public class Plus {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int N){
        for(int i=1;i<=2*N;i++){
            for(int j=1;j<=2*N;j++){
                if(i==N || j==N){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
