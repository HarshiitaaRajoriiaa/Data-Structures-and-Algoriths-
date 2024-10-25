import java.util.*;
//? Write a java program to check whether a character is alphabet, digit or special character.
public class CheckDType{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char i = s.next().charAt(0);
        if((i>='a') && (i<='z')  || (i>='A') && (i<= 'Z')){
            System.out.println("Alphabet");
        }
        else if(i>='0' && i<='9'){
            System.out.println("digit");
        }
        else{
            System.out.println("Special Character");
        }

    }
}