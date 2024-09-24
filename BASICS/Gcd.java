
// TODO:https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
public class Gcd{
    public static void main(String[] args) {
        System.out.println(gcd(20,40));
        
    }
    public static int gcd(int a, int b){
        int temp = 0 ; 
        while(b!=0){
            b=temp;
            b=a%b;
            a=temp;
        }
        return a;
    }
}


// *   The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both numbers without leaving a remainder.  the GCD of two numbers also divides their difference.
// * EUCLIDEAN THEOREM : gcd(a ,b ) == gcd(a,b/a)