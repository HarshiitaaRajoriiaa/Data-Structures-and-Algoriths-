package QUESTIONS.BASICS;
//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
public class AmstrongNumbers{
    public static void main(String[] args) {
        System.out.println(armstrongNumber(371));
        
    }
    public static String armstrongNumber(int n) {
        int original = n;
        int sum = 0;
        while(n!=0){
            int N = n%10; //Last digit:
            sum =  sum + (N*N*N);
            n = n/10; //Delete last digit:
        }
        String result = "null";
        if(sum==original){
            result= "true";
        }
        else{
            result = "false";
        }
        return result;
    }
}