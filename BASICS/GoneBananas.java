
 // In the question one condition is missing,
// which is that the number of bananas given to each of the people should be equal.

import java.util.Scanner;
// Since every banana is to be given away and the number of banana each monkey receives is an integer , 
// we can choose a M number of monkeys, such that M is a divisor of N. 
// So, now we can conclude that it is NOT possible to give away bananas with the above restrictions when N is a prime number.
public class GoneBananas {
        public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if(n == 1) {
                System.out.println("No");
            }

            else { // check if n is prime or not
                boolean isPrime = true;
                for(int i = 2; i*i <= n; ++i)
                    if(n % i == 0) {
                        isPrime = false;
                        break;
                    }
                
                if(isPrime)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }
        }

        sc.close();
    }
}
    
