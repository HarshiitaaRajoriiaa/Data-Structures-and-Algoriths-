package PATTERNS.PyramidPattern;

public class Pyramid {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int N){
        for(int i=1;i<=N;i++){
            //*trailing spaces:
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
