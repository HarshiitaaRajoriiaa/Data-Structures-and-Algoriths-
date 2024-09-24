
import java.util.Scanner;
// TODO: For a=n-3,b=1,c=1 and d=1, we can see that a+b+c+d=n and gcd(a,b)=lcm(c,d)=1
public class GcdVsLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            System.out.print(n-3+" "+1+" "+1+" "+1);
            System.out.println();
        }
    }
}
