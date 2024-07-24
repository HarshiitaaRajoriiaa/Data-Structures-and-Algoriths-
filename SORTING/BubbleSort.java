package SORTING;

public class BubbleSort {
    public static void main(String[] args) {
        
    }
    public static void bubbleSort(int a[], int n)
    {
        for(int i = 0 ;i<n;i++){
            // int j=0;
            for(int j = 0 ;j <n-1;j++){
                if(a[j] > a[j+1]){
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            // j++;
        }
    }
}
