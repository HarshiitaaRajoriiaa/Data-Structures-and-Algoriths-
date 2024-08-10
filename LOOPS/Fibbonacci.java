package LOOPS;

public class Fibbonacci {
    public static void main(String[] args) {
        printFibonacci(5);
    }

    // todo fibonacci number till Nth place
    public static void printFibonacci(int N) {
        int first = 0;
        int second = 1;
        int next;
        for (int i = 1; i <= N; i++) {
            System.out.println(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

    }
}
