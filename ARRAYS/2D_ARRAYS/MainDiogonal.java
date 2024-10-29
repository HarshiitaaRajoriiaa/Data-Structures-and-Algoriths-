public class MainDiogonal {
    public static void main(String[] args) {

    }

    public static void printMainDio(int arr[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    // 2 way
    public static void printMainDio2(int arr[][], int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][i]);
        }
    }
}


