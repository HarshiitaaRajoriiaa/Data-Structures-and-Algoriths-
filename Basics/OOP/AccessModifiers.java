package Basics.OOP;

public class AccessModifiers {

     // Public field - Accessible from anywhere
     public String publicMessage = "This is a public message";
   
     // Private field - Accessible only within this class
     private String privateMessage = "This is a private message";
   
     // Protected field - Accessible within this class and subclasses (package-private by default)
     protected String protectedMessage = "This is a protected message";
   
     // Default field (package-private) - Accessible within the same package
     int defaultMessage = 42; // Example of a default field (no access modifier specified)
   
     // Public method - Accessible from anywhere
    public void publicMethod() {
        System.out.println(publicMessage);
        System.out.println(this.privateMessage); // Can access private within the class
        System.out.println(protectedMessage);
        System.out.println(defaultMessage);
    }
    // Private method - Accessible only within this class
    private void privateMethod() {
        System.out.println("This is a private method");
    }
    
    // Protected method - Accessible within this class and subclasses (package-private by default)
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
    
    // Default method (package-private) - Accessible within the same package
    void defaultMethod() {
        System.out.println("This is a default method");
    }
    
    // Public constructor - Accessible from anywhere to create objects
    public AccessModifiers() {
        System.out.println("Public constructor called");
    }
    
    // Private constructor - Cannot be called from outside the class (useful for singletons)
    private AccessModifiers(String message) {
        System.out.println("Private constructor called with message: " + message);
    }

    // Protected constructor - Can be called from within the class and subclasses
    protected AccessModifiers(int value) {
        System.out.println("Protected constructor called with value: " + value);
    }
    
    public static void main(String[] args) {
        System.out.println("hello from am");

    }
}
