package Basics;

import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {
        // System.out.println("hello from loops");
        // System.out.println("hello world from loops");
        Scanner sc = new Scanner(System.in);
        // System.out.println("hello world");


        //IF-ELSE:
        /*
         * if(condition){
         * body run if true}
         * else{
         * body run if , if condition false:
         * }
        1. can be without else{} , but else{} can't exist without if(){}
        2. one line can be executed without {} after if() or else but more than one need to between { }.
         */
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        if(marks1>=33  && marks2>=33)
            System.out.println("pass");
        
        else
            System.out.println("fail");
        
        
            int marks3 = sc.nextInt();
            int marks4 = sc.nextInt();
        if(marks1>=33  || marks2>=33){
            System.out.println("either marks1 are passing marks");
            System.out.println("or marks2 are passing marks");
        }
        else
            System.out.println("both marks are below passing criteria:");
        

        //TERNARY OPERATOR:
        


        // //WITHOUT INITALISATION:
        // int i = 0;
        // for(;i<=20;i++){
        //     System.out.println(i);
        // }
        // //WITHOUT CONDITION:
        // for( ; ; i+=2){
        //     if(i==10){
        //     System.out.println(i);
        //     break;
        //     }
        // }
        // //WITHOUT UPDATION:
        // for(;;){
        //     if(i==10){
        //         System.out.println(i);
        //         break;
        //     }
        //     i++;
        //}   
    }
}