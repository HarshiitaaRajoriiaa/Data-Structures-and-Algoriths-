
import java.util.*;
// TODO : https://codeforces.com/contest/1352/problem/A
import java.util.Scanner;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int count = countRoundNumbers(n);
            System.out.println(count);
            printRoundNumbers(n);
        }

        scanner.close();
    }

    // Method to count the number of round numbers
    public static int countRoundNumbers(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    // Method to print the round numbers
    public static void printRoundNumbers(int N) {
        int mul =1;
        boolean first = true;
        while(N>0){
            int last = N%10;
            if(last !=0)
                if(!first) System.err.print(" ");
            System.out.println(last*mul);
            N/=10;
            mul *=10;
        }
        System.out.println();
    }
}

