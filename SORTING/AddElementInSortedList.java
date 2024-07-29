
import java.util.ArrayList;

public class AddElementInSortedList {
    public static void main(String[] args) {
        
    }
    public static void addElementinSortedList(ArrayList<Integer> sortedList , int element){
        sortedList.add(element); // Add the new element at the end
        for(int i = sortedList.size()-1; i>=0;i--){
            if(sortedList.get(i) < sortedList.get(i-1)){
                swap(sortedList, i, i-1);
            }
            else{
                break;
            }
        }

    }
    public static void swap(ArrayList<Integer> list, int i1, int i2) {
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }
    
}
