public class CornerSum {
    //?https://www.geeksforgeeks.org/problems/corner-digits1317/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    public static void main(String[] args) {
        
    }
    public int corner_digitSum(int n){
        // code here
        if(n<10) return n;
        String N = String.valueOf(n);
        int n1 = Integer.parseInt(String.valueOf(N.charAt(0)));
        int last = n % 10;
        return (last+n1);
    }   
}
