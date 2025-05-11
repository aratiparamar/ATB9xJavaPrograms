package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab158 {
    public static void main(String[] args) {
        child c=new child();
        c.loan50k();
        c.loan20k();
    }
}

class child extends Father{
    @Override
    public void loan50k() {
        System.out.println("50k loan by child");
    }
}

abstract class Father{
    abstract void loan50k();
    void loan20k(){
        System.out.println("20k loan");
    }
}
