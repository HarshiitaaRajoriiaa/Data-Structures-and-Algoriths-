
//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
public class NoOFOccurence {
    public static void main(String[] args) {
        int Arr[] = { 1, 1, 2, 2, 2, 2, 3 };
        System.out.println(count(Arr, 7, 2));

    }

    public static int count(int[] arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}
