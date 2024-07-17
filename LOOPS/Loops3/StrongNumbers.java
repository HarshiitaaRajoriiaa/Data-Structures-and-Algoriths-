package QUESTIONS.LOOPS.Loops3;

public class StrongNumbers {
    public static void main(String[] args) {
        // System.out.println("hello");
    }
    public static void strongNumbers(int n){

    }
    public static int sumOfFactOfDigits(int n){
        String number = String.valueOf(n);
        int sum = 0;
        for(int i = 0;i<number.length();i++){
            int curr = Integer.parseInt(String.valueOf(number.charAt(i)));
            int fact = 1;
            while(curr!=0){
                fact*=curr;
            }
            System.out.println(i + " : " + fact);
        }
        return sum;
    }

}
