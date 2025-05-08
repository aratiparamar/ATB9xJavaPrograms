package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.Example1;

public class Lab145_SI {
    public static class Lab145_Single_Inheritance {
        public static void main(String[] args) {
            //Single Inheritance
            //Parent-> Child
            //Super Class-> Sub Class
            //Base Class-> Derived Class
            //One child, one parent
            Son s1=new Son();
            System.out.println(s1.gold_f);
            s1.BHK2(); //Son has extended
            s1.BHK3();

//            Father f1=new Father();
//            f1.BHK3();
        }
    }
}
