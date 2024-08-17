package LOOPS;
//? first N numbers which has sum equals to K
public class FirstNNumbers {
    public static void main(String[] args) {
        System.out.println("he");
        System.out.println(firstNNumbers(5, 5));
    }
    public static int firstNNumbers(int N , int K){
        int n=1;
        int count=0;
        while(count<K){
            int sum=0;
            while(n>0){
                sum = n%10;
                n/=10;
            }
            if(sum==K) 
            {   count++;
                System.out.println(n);
            }
            n++;
        }
        return count;
    }
}
