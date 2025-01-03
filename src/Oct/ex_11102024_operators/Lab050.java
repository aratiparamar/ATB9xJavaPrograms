package Oct.ex_11102024_operators;

public class Lab050 {
    public static void main(String[] args) {
        boolean b=true;

        System.out.println(!b);
        // XOR -> Gate

        int a=10;
        a+=10; // a=a+10;
//        a-=10;
//        a*=10;
//        a/=10;
        System.out.println(a);

        // new Operator= OOP's
        String name= new String("Aarti");
        //new= new memory or object in heap area

        // instanceof operator
        System.out.println(name instanceof String);

    }
}
