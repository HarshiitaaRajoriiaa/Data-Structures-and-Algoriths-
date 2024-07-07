import java.util.Scanner;
public class Rough {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = n;i>0;i--){
            if(n%i==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}






   

       


    
