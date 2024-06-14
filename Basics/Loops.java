package Basics;

import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {
        System.out.println("hello from loops");
        System.out.println("hello world from loops");
        Scanner sc = new Scanner(System.in);
        System.out.println("hello world");
        //WITHOUT INITALISATION:
        int i = 0;
        for(;i<=20;i++){
            System.out.println(i);
        }
        //WITHOUT CONDITION:
        for( ; ; i+=2){
            if(i==10){
            System.out.println(i);
            break;
            }
        }
        //WITHOUT UPDATION:
        for(;;){
            if(i==10){
                System.out.println(i);
                break;
            }
            i++;
        }   
    }
}