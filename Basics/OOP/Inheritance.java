package Basics.OOP;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("hello from in");
        //Object of parent class:
        Inheritance bicycle = new Inheritance("cosco" , true);
        bicycle.no_tyres = 2;
        bicycle.ac = "no";
        bicycle.print();
       

        //Object of child class:
        Car tesla = new Car( "op-model" , true , 4);
        tesla.no_plate = "Dl - 5628";
        tesla.company = "elon-musk";
        tesla.capacity_print();
        tesla.print();
    }

    boolean vechile;
    int no_tyres;
    String ac;
    String model;
    Inheritance(){
        System.out.println("hello from vechile const");
    }
    Inheritance( String model , boolean vechile ){
        System.out.println("hello from vchile const 2");
        this.model = model;
        this.vechile = vechile;
    }
    void print(){
        System.out.println(no_tyres );
        System.out.println(model );
    }
}

class Car extends Inheritance{
    int seats;
    String company;
    String no_plate;

    Car(String model , boolean vechile ,int seats ){
        super(model , vechile);
        this.seats = seats;
        System.out.println("hello from  car const 2");
    }

    Car(){
        System.out.println("hello from  car const 1");
    }
   
    void capacity_print(){
        System.out.println(seats);
        System.out.println(seats-1);
    }


//Multiclass Inheritance will have properties of own, and car, and vechile:
//

class truck extends Inheritance{
    int weight;
    int current_weight;
    int permit;
    int no_tyres;
    void capacity(){
        System.out.println(current_weight - weight);
    }
}
}

/*SUMMARY:
1. variable: child class > parentclass
2. Constructor: parent class > child class
3. two const parametrized / non-parametrized : child class para , parent class : non (through obj of child class)
super:call method of parent class when overridding is going on
*/