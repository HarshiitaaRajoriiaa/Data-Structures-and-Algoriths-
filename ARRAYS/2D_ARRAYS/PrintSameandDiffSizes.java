
public class PrintSameandDiffSizes {
    public static void main(String[] args) {

        // todo Row wise-
        int arr[][] = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            for (int val : arr[i]) {
                System.out.println(val);
            }
        }
        int aa3[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 } }; // 4X3

        for (int i = 0; i < aa3.length; i++) {
            for (int j = 0; j < aa3[j].length; j++) {
                System.out.print(aa3[i][j] + " ");
            }
            System.out.println("  ");
        }
        System.out.println(" ");

        // todo col wise-
        int aa4[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 } }; // 4X3

        int max = aa4[0].length;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < aa4.length; j++) {
                System.out.print(aa4[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println(" ");

    }
}
