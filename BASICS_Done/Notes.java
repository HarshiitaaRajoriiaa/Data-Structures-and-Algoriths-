//?Write a Java program to input amount from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount.
import java.util.*;
public class Notes {

    public static void main(String[] args) {
        System.out.println("notes");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int notes[] = {500, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        for (int i = 0; i < notes.length; i++) {
            if(n>notes[i]) {
                count += n/notes[i];
                n = n%notes[i];
                System.out.println(notes[i] + ":" + count);
            }
            
        }
    }
}
