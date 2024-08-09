package LOOPS;

public class lcmOf2Num {
    public static void main(String[] args) {
        System.out.println(lcmOf2Num(2, 6));
    }
    public static  int lcmOf2Num(int a , int b){
        int lcm =0;
        for(int i =1;i<=Math.min(a,b) ;i++){
            if(a%i==0 && b%i==0) lcm =i;
        }
        return lcm;
    }
}
