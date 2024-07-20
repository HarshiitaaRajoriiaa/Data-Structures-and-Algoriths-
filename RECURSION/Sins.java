

import java.util.Scanner;

//https://www.codechef.com/problems/SINS
public class Sins {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s =new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
		  int a =s.nextInt();
		  int b = s.nextInt();
		  System.out.println(sin(a,b));
		  t--;
		}
  s.close();
	}
	public static int sin(int a ,int b){
	  int a1=a;
	  int b1=b;
	    if(a==b || a==0 || b==0){
	      return a+b;
	    }
	    if(a>b){
	      a1= a-b;
	    }
	    else{
	      b1=b-a;
	    }
	    return sin( a1 , b1);
	}


}
