package Basics.OOP;

public class Abstract {
    public static void main(String[] args) {
        System.out.println("HELLO FROM ab");
        A obj = new A();
        //obj.display();//error
        GetSet obj1 = new GetSet();
        obj1.set("hello world");
        System.out.println(obj1.get());
    }
}
//Another class with private method:
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
    
