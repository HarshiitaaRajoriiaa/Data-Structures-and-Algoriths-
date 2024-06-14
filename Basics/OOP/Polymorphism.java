package Basics.OOP;

public class Polymorphism {
    public static void main(String[] args) { 
		
		Polymorphism ob = new Polymorphism(); 
		int prod1 = ob.multiply(1, 2); 
		System.out.println( 
			"Product of the two integer value :" + prod1); 

		
		int prod2 = ob.multiply(1, 2, 3); 
		System.out.println( 
			"Product of the three integer value :" + prod2); 


        Polymorphism obj = new Polymorphism(); 
        int prod3 = obj.Prod(1, 2, 3); 
        System.out.println( 
                "Product of the three integer value :" + prod1); 
      
        double prod4= obj.Prod(1.0, 2.0, 3.0); 
        System.out.println( 
                "Product of the three double value :" + prod2); 
        } 
	 


   //no of parameters:
    public int multiply(int a, int b) { 
		int prod = a * b; 
		return prod; 
	} 
	public int multiply(int a, int b, int c) { 
		int prod = a * b * c; 
		return prod; 
	} 
    
    //type of argu:
    public int Prod(int a, int b, int c) { 
        int prod1 = a * b * c; 
        return prod1; 
    } 
    public double Prod(double a, double b, double c)  { 
        double prod2 = a * b * c; 
        return prod2; 
    } 


}