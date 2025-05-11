package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab159 {
    public static void main(String[] args) {
        wagonR w=new wagonR();
        w.drive();

        Tesla t=new Tesla();
        t.drive();

        //engine e=new engine();
    }
}

class wagonR extends engine{
    void drive(){
        startengine();
        stopengine();
    }

    @Override
    void startengine() {
        System.out.println("WagonR engine started");
    }

    @Override
    void stopengine() {
        System.out.println("WagonR engine stopped");
    }
}

abstract class engine{
    abstract void startengine();
    abstract void stopengine();
}