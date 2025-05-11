package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Tesla extends engine{
    @Override
    void startengine() {
        System.out.println("Starting at the electric engine");
    }

    @Override
    void stopengine() {
        System.out.println("stopping at the electric engine");
    }

    void drive(){
        startengine();
        stopengine();
    }
}
