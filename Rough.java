import java.util.Scanner;
public class Rough {
    public static void main(String[] args) {
        int  n = 142;
            String number = String.valueOf(n);
            int sum = 0;
            for(int i = 0;i<number.length();i++){
                int curr = Integer.parseInt(String.valueOf(number.charAt(i)));
                int fact = 1;
                while(curr!=0){
                    fact*=curr;
                }
                System.out.println(i + " : "+ fact);
            }
            // System.out.println(sum);
        
    }
}






   

       


    
