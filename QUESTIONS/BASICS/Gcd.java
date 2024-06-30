package QUESTIONS.BASICS;
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


// *  Euclidean algorithm 