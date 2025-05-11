package Nov.ex_08112024_Polymorphism.Overriding;

public class Lab150 {
    public static void main(String[] args) {
        Hound h1=new Hound();
        h1.bark();
    }
}
class Dog{
    void bark(){
        System.out.println("Dog is barking");
    }
    int age=10;
}
class Hound extends Dog{
    @Override
    void bark(){
        System.out.println("Hound is barking");
    }
    int age=20;
    void eat(){
        System.out.println("Hound is eating");
        System.out.println(age);
        System.out.println(super.age);
    }
}
