package Basics;
import java.util.Scanner;
import java.util.*;
public class Questions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // * FIZZ-BUZZ VARIATION: nothing to be printed if i%4==0
        int N = s.nextInt();
        for (int i=1;i<=N;i++){
            if((i%3==0) && (i%5==0)){
                System.out.println("FizzBuzz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%4==0){
                //System.out.println(" ");
                continue;
            }
            else{
                System.out.println(Integer.toString(i));
            }

        }
        // * FIZZ-BUZZ VARIATION:stop when sum of no printed is > 3*N
        // int N = s.nextInt();
        // System.out.println(3*N);
        // int sum = 0 ; 
        // for (int i=1;i<=N;i++){
        //     if((i%3==0) && (i%5==0)){
        //         System.out.println("FizzBuzz");
        //     }
        //     else if(i%5==0){
        //         System.out.println("Buzz");
        //     }
        //     else if(i%3==0){
        //         System.out.println("Fizz");
        //     }
        //     else{
        //         System.out.println(Integer.toString(i));
        //         sum = sum + i;
        //         System.out.println("sum is = " + sum);
        //     }

        //     if(sum>3*N){
        //         break;
        //     }
        


        //*print maximum no. /take input from user:
        // int n1 = s.nextInt();
        // int n2 = s.nextInt();
        // // **01 way:
        // System.out.println(Math.max(n1, n2));
        // //**02 way:
        // if(n1>n2){
        //     System.out.println(n1);
        // }
        // else if (n1==n2){
        //     System.out.println(n1 );
        // }
        // else
        //     System.out.println(n2);

        // //*PRINT MAX(A,B,C) , INPUT FROM USER:
        // int n11= s.nextInt();
        // int n22= s.nextInt();
        // int n33= s.nextInt();
        // if(n11>n22 && n1>n33){
        //     System.out.println("n1 is greater " + n1);
        // }
        // else if(n22>n33){
        //     System.out.println("n2 is greater "  + n2);
        // }
        // else{
        //     System.out.println("n3 is greater " + n3);
        // }

        // //*PRINT NO. FROM 1 TO N IN INCREASING ORDER HAVE INPUT FROM USER:
        // int N = s.nextInt();
        // for(int i =1 ; i <=N ; i++){
        //     System.out.println(i);
        // }

        // //*PRINT NO. FROM 1 TO N IN DECENDING ORDER HAVE INPUT FROM USER:
        // for(int i =N; i>=1 ; i--){
        //     System.out.println(i);
        // }


        //* PRINT NO FROM 1 TO N WHICH ARE DIVISIBLE BY 7:
        // int N = s.nextInt();
        // for(int i=0 ; i<=N;i++){
        //     if(i%7==0){
        //         System.out.println(i);
        //     }
        // }

        //* PRINT TABLE OF N:
        // int N = s.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(N + " X " + i  + " = " + i*N);
        // }
    }
}
