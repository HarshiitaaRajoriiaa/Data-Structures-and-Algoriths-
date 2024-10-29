
public class InterchangeDio {
    public static void main(String[] args) {

    }

    public static void printSecDio(int matrix[][], int n) {
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][n - 1 - i];
            matrix[i][n - 1 - i] = temp;
        }
    }
}
