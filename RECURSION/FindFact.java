public class FindFact{
    public static void main(String[] args) {
        
    }
    //without recursion:
    public static void factorial1(int n){
        int ans = 1;
        for(int i = n; i > 0; i--){
            ans = ans * i;
        }
        System.out.println(ans);
    }

    //with recursion:
    public static int  factorial2(int n){
        int result = 0 ;
        if (n ==0 || n==1){
            return 1;
        }

        else{
            result  = n*factorial2(n-1);
        }
        return result;
        }
}