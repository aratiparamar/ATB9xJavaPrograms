package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab161_Interface_p2 {
    public static void main(String[] args) {
        P p=new P();
        p.m1();

        //I i=new I();
    }
}

class P implements I1{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

interface I1{
    void m1();
    void m2();
    void m3();
}