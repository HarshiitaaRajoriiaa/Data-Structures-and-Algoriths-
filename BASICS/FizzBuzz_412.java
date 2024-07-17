package QUESTIONS.BASICS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz_412 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<String> result = fizzBuzz(n);
        for (String str : result) {
            System.out.println(str);
        
        }
    }
    public static List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}


// *NOTES:
/*
 * declaration of arraylist = ArrayList<dtype> 'name' = new  ArrayList<dtype>(); /or
 * ArrayList <Double> arr3 = new ArrayList<>(List.of(6.9 , 8.9 , 66.0 ));
 * arr3.add(element) = add at the end of the list:
 */
