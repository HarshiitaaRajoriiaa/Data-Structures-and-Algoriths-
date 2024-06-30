package QUESTIONS.ARRAYS;

public class NoOfEmployee {
    public static void main(String[] args) {
        int hours[] = {0,1,2,3,4};
        int target =2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
    public  static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int noofemp = 0;
        int n = hours.length;
        for ( int i = 0; i< n ; i++)
        {
           if( hours[i] >= target )
           {
               noofemp++;
           }
        }
        return noofemp;
    }
}
