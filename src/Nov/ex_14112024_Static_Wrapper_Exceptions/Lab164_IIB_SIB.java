package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class Lab164_IIB_SIB {
    public static void main(String[] args) {
        //A a2; prints nothing

//        A a1=new A();
//        A a2=new A();

        new A(); //Only ref creation does not call the SIB & IIB
    }
}
class A{
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }
}