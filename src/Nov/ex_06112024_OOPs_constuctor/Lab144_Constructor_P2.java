package Nov.ex_06112024_OOPs_constuctor;

import java.util.Scanner;

public class Lab144_Constructor_P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Car3 t1=new Car3("tesla");
        System.out.println(t1.model);
        System.out.println(t1.year);
        t1.display();

        Car3 t2=new Car3("nano",1998);
        System.out.println(t2.model);
        System.out.println(t2.year);
        t2.display();


    }
}

class Car3{
    String model;
    int year;

    Car3(){
        System.out.println("Default Constructor");
        model="Unknown model";
        year=0;

    }
//Parameterized constructor 1
    Car3(String model_name, int year_created){
        System.out.println("PC1");
        this.model=model_name;
        this.year=year_created;
    }
    //Parameterized constructor 2
    Car3(String model_name){
        System.out.println("PC2");
        this.model=model_name;
    }

    void display(){
        System.out.println("Car2 Details-> " +this.model+ " " +this.year);
    }
}
