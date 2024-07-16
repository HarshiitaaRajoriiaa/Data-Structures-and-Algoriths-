import java.lang.reflect.Array;

public class AddArrayExceptSelf {
    public static void main(String[] args) {
        
    }
    public static int[] addElementsExcepSelf(int arr[]){
        int outputPre[] = new int[arr.length];
        outputPre[0] = 0 ;
        for(int i = 1 ; i < arr.length ; i++){
            outputPre[i] = outputPre[i-1] + arr[i-1];
        }
        int suffAdd = 0;
        for(int i = arr.length ; i >=0;i--){
            outputPre[i] += suffAdd;
            suffAdd +=arr[i];
        }
        return outputPre;
    }
}
