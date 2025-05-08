package Nov.ex_07112024_OOPs_Inheritance.MultilevelInheritance;

public class Lab147 {
    public static void main(String[] args) {
        Child c=new Child();
        c.GrandFatherMoney();
        c.F();
        c.home();
        c.C();

        Father F1=new Father();
        F1.home();
        F1.F();
        F1.GrandFatherMoney();

        GrandFather G1=new GrandFather();
        G1.GrandFatherMoney();
        G1.home();
    }
}
