package QUESTIONS.ARRAYS.MAX_MIN;

public class MinMaxElements {
    public static void main(String[] args) {
        
    }
    public Pair<Long, Long> getMinMax(int[] arr) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return new Pair<>(min, max);
    }
}
