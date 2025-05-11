package Nov.ex_08112024_Polymorphism.Overriding;

public class Lab151 {
    public static void main(String[] args) {
        Son s=new Son();
        s.home();

        Father f=new Father();
        f.home();

        //Dynamic Dispatch
        Father f2=new Son();
        f2.home();

//        Son s2=new Father(): Not possible
//        s2.home();
    }
}
class Father{
    void home(){
        System.out.println("Father's home");
    }
}
class Son extends Father{
    @Override
    void home(){
        System.out.println("Son's home");
    }
}
