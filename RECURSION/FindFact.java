public class FindFact{
    public static void main(String[] args) {
        
    }

    //with recursion:
    public static int  factorial2(int n){

        if (n ==0 ) return 1;
        int result  = n * factorial2(n-1);
        return result;
    }
}