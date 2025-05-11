package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab155_Super {
    public static void main(String[] args) {
        Car c=new Car();
        c.display();
    }
}

class Car extends vehicle{
    private int maxSpeed=281;

    @Override
    void display(){
        System.out.println("Child");
        System.out.println("Max Speed of Parent class is "+super.maxSpeed);
        System.out.println("Max Speed of Child class is "+this.maxSpeed);
        //this.display();
        //super.display();
    }

    Car(){
        super(10);
        System.out.println("Car DC");
    }

//    void message(){
//        System.out.println("Hello car");
//        super.message();
//    }
//
//    void message(int a){
//        System.out.println("parameterized- Hello car");
//        super.message();
//    }
}

class vehicle{
    public int maxSpeed=180;

    void display(){
        System.out.println("Parent");
    }

    vehicle(){
        System.out.println("Vehicle DC");
    }

    vehicle(int a){
        System.out.println("Vehicle PC");
    }

    void message(){
        System.out.println("Hello vehicle");
    }

    void message(int a){
        System.out.println("parameterized- Hello vehicle");
    }
}
