package LOOPS;
//?Write a Java program to print natural numbers in reverse from n to 1.
import java.util.*;

public class ReverseNaturalNo {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = n.nextInt();
        while(num>0){
            System.out.println(num);
            num--;
        }
    }
}
