package Basics;
import java.util.Scanner;
import java.util.*;
public class Questions {
    public static void main(String[] args) {
        //print maximum no. /take input from user:
        Scanner s = new Scanner(System.in);
    //     int n1 = s.nextInt();
    //     int n2 = s.nextInt();
    //     // 01 way:
    //     System.out.println(Math.max(n1, n2));
    //     //02 way:
    //     if(n1>n2){
    //         System.out.println(n1);
    //     }
    //     else if (n1==n2){
    //         System.out.println(n1 );
    //     }
    //     else
    //         System.out.println(n2);

    //PRINT MAX(A,B,C) , INPUT FROM USER:
    int n1= s.nextInt();
    int n2= s.nextInt();
    int n3= s.nextInt();
    if(n1>n2 && n1>n3){
        System.out.println("n1 is greater " + n1);
    }
    else if(n2>n3){
        System.out.println("n2 is greater "  + n2);
    }
    else{
        System.out.println("n3 is greater " + n3);
    }
    }
}
