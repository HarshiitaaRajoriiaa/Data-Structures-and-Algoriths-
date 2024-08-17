package PATTERNS.MiscellaneousStar;

public class Diamond {
    public static void main(String[] args) {
        diamond(5);
    }
    public static void diamond(int N){
        print(N);
        print2(N-1);

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
    public static void print2(int N){
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
