package Nov.ex_08112024_Polymorphism.Overloading;

public class Lab149 {
    public static void main(String[] args) {
        MathOperations m1=new MathOperations();
        int result1=m1.sum(1,2);
        System.out.println(result1);
    }
}
class MathOperations{

    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
//    void sum(int a, int b, int c){
//        System.out.println("Hello");
//    }
//    double sum(double a,double b){
//        return a+b;
//    }
}
