package QUESTIONS.BASICS;

public class PrimeNumber {
    public static void main(String[] args) {
        
    }
    static int isPrime(int N) {
        if (N <= 1) {
            return 0;
        }
        if (N <= 3) {
            return 1;
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return 0;
        }
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return 0;
            }
        }
        return 1;
        }
}
