
public class LengthOfArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        System.out.println(arr.length); //row 
        // length of rows
        System.out.println(arr[0].length); //col
        // length of columns if all have same size
        System.out.println(arr[2].length);
        System.out.println(arr[3].length);
        System.out.println(arr[1].length);
        // if all have different sizes
    }
}
