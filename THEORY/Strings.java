package THEORY;

public class Strings {
    public static void main(String[] args) {
        System.out.println("hello from strings");
        String name = "Harshita";
        String age = new String ( "twenty one " );
        String college_name = new String ( "indira gandhi delhi technical university " );
        //Addition and concatenation:
        String greet = "hello" + name + "how are you " ;  // Addition 
        System.out.println(name);
        System.out.println(age);
        System.out.println(college_name);
        System.out.println(greet);

       //METHODS:
        //length()
        System.out.println(name.length());
        //charAt()
        System.out.println(name.charAt(3));
       //split()
       String adress = " bblock , swaroop nagar , delhi ";
       String list[] = adress.split( "," );
       System.out.println(list);
       //conatins()
       adress.contains("bblock");
       //trim()
       String adress1 = "      bblock , swaroop nagar ,delhi       ";
       String trimmed  =  adress1.trim();
       System.out.println(trimmed);
       //equals
       String string1 = "acbd";
       String string2 = "ABCD";
       string1.equals(string2) ;//not equal
       string1.equalsIgnoreCase(string2);// abcd = ABCD  
       //System.out.println(compareToIgnoreCase(string1, string2));
       //compareTo(string1, string2);
       // if string 1 = string 2 returns 0
       // if string 1 > string 2 returns +
       // if string 1 < string 2 returns - 
       //string to int
       String numberString = "123";
       int number = Integer.parseInt(numberString);
       System.out.println(number); // Output: 123
       Integer.toString( number ); 
       //Character.getNumericValue()
       char ch1 = '5';
       int numValue1 = Character.getNumericValue(ch1);
       System.out.println(numValue1); // Output: 5

       char ch2 = 'a';
       int numValue2 = Character.getNumericValue(ch2);
       System.out.println(numValue2); // Output: 10

       char ch3 = '%';
       int numValue3 = Character.getNumericValue(ch3);
       System.out.println(numValue3); // Output: -1 (no numeric value)
       
       
    
    }
}
