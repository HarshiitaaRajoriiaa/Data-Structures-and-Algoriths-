package THEORY.OOP;

public class Encapsulation {
   public static void main(String[] args) {
      System.out.println("hello from en");
      A obj = new A();
      //obj.display();//error
      GetSet obj1 = new GetSet();
      obj1.set("hello world");
      System.out.println(obj1.get());
   }
}

class A {
   private void display(){
       System.out.println("GeeksforGeeks");
   }
}

class GetSet{
   private String varString;
   public void set(String x){
       varString = x;
   }

    public String  get(){
       return varString;
   }
}