package LOOPS;

public class EvenBtwRange {
    public static void main(String[] args) {
        printEven(10);
    }
    public static void printEven(int Range){
        for (int i = 1; i <= Range; i++) {
            if(i%2==0) System.out.println(i);
        }
    }
}
