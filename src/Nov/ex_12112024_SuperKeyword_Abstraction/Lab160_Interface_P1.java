package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab160_Interface_P1 {

}

abstract class ABC{
    ABC(){}

    abstract void m1();

    void m2(){
        System.out.println("complete method");
    }
}

interface I{
    void m1(); //by default abstract
    void m2();

    //void m3(){System.out.println("complete method");} interface can't have complete method
    //new features
    default void m4(){
        System.out.println("default method");
    }

    static void m5(){
        System.out.println("static method");
    }
}