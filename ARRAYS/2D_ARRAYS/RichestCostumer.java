import java.util.*;
//?https://leetcode.com/problems/richest-customer-wealth/
public class RichestCostumer {
    public static void main(String[] args) {
        int bank[][]= {
            { 1,2,3},
            {3,2,1}
        };
        System.out.println(maximumWealth(bank));
    }
    public  static int maximumWealth(int[][] accounts) {
        int max =Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            max = Math.max(max , sum);
        }
        return max;
    }
}
