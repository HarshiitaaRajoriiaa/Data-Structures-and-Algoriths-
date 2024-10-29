
public class SecondDio {
    public static void main(String[] args) {

    }
    public static void printSecDio(int arr[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + j == N - 1) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    // 2 way
    public static void printSecDio3(int arr[][], int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][N - 1 - i]);
        }
    }
}
