
//https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
public class CanPlaceFlower {
    public static void main(String[] args) {
        
    }
    public boolean canPlaceFlowers(int[] arr, int n) {
        if (n == 0) {
            return true;
        }
    
        int length = arr.length;
        
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                boolean leftEmpty = (i == 0) || (arr[i - 1] == 0);
                boolean rightEmpty = (i == length - 1) || (arr[i + 1] == 0);
    
                if (leftEmpty && rightEmpty) {
                    arr[i] = 1;
                    n--;
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }
    
        return n <= 0;
    }
}
