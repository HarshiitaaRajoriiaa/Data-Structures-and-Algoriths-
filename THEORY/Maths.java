package THEORY;

public class Maths {
    public static void main(String[] args) {
        commonFactors(20,40);
        
    }
    public static void  factors(int N){
        for(int i = 1;i<=N ; i++){
            if(N%i == 0){
                System.out.print(i + " ,");
            }
        }
    }

    public static void greatestCommonDivisior(int n1 , int n2){
        int gcd = 0 ; 
        for(int i = 1 ; i<=n1 && i<=n2 ; i++){ // for(int i = 1 ; i<=Math.min(n1 , n2) ; i++)
            if((n1%i == 0 )&&  ( n2%i == 0 )){
                gcd =i ; 
            }
        }
        System.out.println(gcd);
    }
    public static void commonFactors(int n1 , int n2){
        for(int i = 1 ; i<=Math.min(n1,n2); i++){
            if(n1%i == 0  && n2%i == 0){
                System.out.print(i + " , ");
            }
        }
    }
}
