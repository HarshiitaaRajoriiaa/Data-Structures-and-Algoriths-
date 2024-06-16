package Basics;

import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {
        System.out.println("hello from loops");
        Scanner sc = new Scanner(System.in);
        


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
        // int marks1 = sc.nextInt();
        // int marks2 = sc.nextInt();
        // if(marks1>=33  && marks2>=33)
        //     System.out.println("pass");
        
        // else
        //     System.out.println("fail");
        
        
        //     int marks3 = sc.nextInt();
        //     int marks4 = sc.nextInt();
        // if(marks1>=33  || marks2>=33){
        //     System.out.println("either marks1 are passing marks");
        //     System.out.println("or marks2 are passing marks");
        // }
        // else
        //     System.out.println("both marks are below passing criteria:");
        

        // //IF-ELSEIF-ELSE:
        // // int marks = sc.nextInt();
        // // if(marks>=90)
        // //     System.out.println("good performance " + marks + " / 100");
        
        // // else if(marks>80)
        // //     System.out.println("scored "  +marks+ "/100");

        // // else if(marks>70)
        // //     System.out.println("scored "  +marks+ "/100");

        // // else if(marks>60)
        // //     System.out.println("scored "  +marks+ "/100");

        // // else if(marks>50)
        // //     System.out.println("scored "  +marks+ "/100");

        // // else if(marks>=40)
        // //     System.out.println("have to work hard "  +marks + "/100" );
        // // else{
        // //     System.out.println("fail" + marks + "/100");
        // // }


        // //TERNARY OPERATOR:
        // /*
        //  * Condition...? execute if true:execute if false
        // */

        // int mmarks= sc.nextInt();
        // boolean passed = mmarks>=33?true:false;
        // System.out.println(passed);
        // String rewards = mmarks>90?"first position":"promoted to next class";
        // System.out.println(rewards);

        //SWITCH:
        /*
         * switch(variable){
         *  case value:
         *  body
         *  break;
         * .
         * .
         * .
         *  default:
         *  body
         *  break;}
         */
        // int var = sc.nextInt();
        // switch (var) {
        //     case 1:
        //     System.out.println("frist");
        //     break;
        //     case 2:
        //     System.out.println("second");
        //     break;
        //     case 3:
        //     System.out.println("third");
        //     default:
        //     System.out.println("promoted");
        //     break;
        // }


        //LOOPS:
        //1.FOR LOOP:
        /*
         * for(initialization , condition , updation){
         * body;}
         */
        // for(int rollno =1 ; rollno<=20 ; rollno++){
        //     System.out.println(rollno);
        //}

        // int arr[]= {1,2,3,4,5};
        // for(int n:arr){
        //     System.out.println(n);
        // }




        // * BREAK STATEMENT:
        // for(int i = 0 ; i < 10 ; i ++){
        //     System.out.println(i);
        //     if(i==5){
        //         break;
        //     }
        // }

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