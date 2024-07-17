package QUESTIONS.LOOPS.Loops1;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        System.out.println(factors(12));
    }
    public static ArrayList<Integer> factors(int n){
        ArrayList<Integer> sol = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sol.add(i);
            }
        }
        return sol;
    }
}
