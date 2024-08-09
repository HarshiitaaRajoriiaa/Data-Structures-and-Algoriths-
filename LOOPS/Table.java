package LOOPS;

public class Table {
    public static void main(String[] args) {
        printTable(5);
    }
    public static void printTable(int N){
        for (int i = 1; i <=10; i++) {
            System.out.println(N + " x " +  i + " = " + i*N );
        }
    }
}
