package Nov.ex_15112024_Wrapper_Exception_Part2;

public class Lab173_Conversion {
    public static void main(String[] args) {
        String num="10";
        //String-> Wrapper-> Primitive Int
        Integer a=Integer.valueOf(num);
        int a2=a; //unboxing

        //String to Primitive-Direct conversion
        int a3=Integer.parseInt(num);

        //Wrapper classes
        Long l=10l;
        Short s=23;
        Boolean bb=true;
    }
}
