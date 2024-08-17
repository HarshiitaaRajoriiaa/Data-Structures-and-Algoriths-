
import java.util.List;
//https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class SortedOrNot {
    public static void main(String[] args) {
        
    }
    public boolean arraySortedOrNot(List<Integer> arr) {
        // code here
        int n = arr.size();
        boolean result  = true;
        for(int i = 0 ; i < n -1; i++){
            if(arr.get(i) > arr.get(i+1)){
                result = false;
                break;
            }
        }
        return result;
    }
}
