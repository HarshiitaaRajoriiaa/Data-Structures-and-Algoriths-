package Basics.OOP;

public class Super {
    public static void main(String[] args) { 
        Car small = new Car(); 
        small.display(); 

        Student s = new Student(); 
		s.display(); 
    } 
}

//super with variable.
class Vehicle { 
    int maxSpeed = 120; 
} 
 
class Car extends Vehicle { 
    int maxSpeed = 180; 
    
  
    void display()  {    
        
        // print maxSpeed of base class (vehicle) 
        System.out.println("Maximum Speed: " + super.maxSpeed); 
    } 
} 



// super in method , const:
class Person {
    Person() { 
        System.out.println("Person class Constructor"); 
    } 

	void message() { 
		System.out.println("This is person class\n"); 
	} 
} 
// Subclass Student 
class Student extends Person { 


    Student() { 
        super(); 
        System.out.println("Student class Constructor"); 
    } 


	void message() { 
		System.out.println("This is student class"); 
	} 


	// Note that display() is 
	// only in Student class 
	void display() { 
		message(); 
		super.message(); 
	} 
} 