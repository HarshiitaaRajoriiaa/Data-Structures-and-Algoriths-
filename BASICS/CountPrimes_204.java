package BASICS;
import java.util.Scanner;
//https://leetcode.com/problems/count-primes/description/
public class CountPrimes_204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(1000));
    }
    public  static int countPrimes(int n) {
        if (n <= 1) {
            return 0; 
        }
        boolean a[]= new boolean[n];
        a[0] = false;
        a[1] = false;
        for (int i = 2; i < n; i++) {
            a[i] = true;
        }
        
        for(int i = 2; i*i<n; i++){
            if(a[i] ==true ){
                for(int j = i*i ; j<n;j+=i){
                    a[j] = false;
                }
            }
        }
        int counter = 0 ;
        for(int i = 2;i<n;i++){
            if(a[i] ==true){
                counter++;
            }
        }
        return counter;
    }
}

/*
 * Sieve of Eratosthenes:
 * Alright, imagine you have a really big list of numbers, and you want to find out which ones are prime. 
 * The Sieve of Eratosthenes is like a fun game where you cross out the numbers that aren't prime until you're left with only the prime numbers.
 */
