package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab162_P3_MultipleInheritance {

}
class child1 implements Father1, Mother1{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void same() {
        System.out.println("1 same method");
    }
}

interface Father1{
    void m1();
    void m2();
    void same();
}

interface Mother1{
    void m3();
    void m4();
    void same();
}
