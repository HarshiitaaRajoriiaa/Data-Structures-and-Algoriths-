//?https://www.geeksforgeeks.org/problems/count-sorted-rows2702/1
public class CountSorted {
    public static void main(String[] args) {

    }
    int sortedCount(int N, int M, int Mat[][]) {
        // code here
        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean increasing = true, decreasing = true;
            for (int j = 0; j < M - 1; j++) {
                if (Mat[i][j] >= Mat[i][j + 1]) {
                    increasing = false;
                }
                if (Mat[i][j] <= Mat[i][j + 1]) {
                    decreasing = false;
                }
            }
            if (increasing || decreasing) {
                count++;
            }
        }

        return count;

    }
}
