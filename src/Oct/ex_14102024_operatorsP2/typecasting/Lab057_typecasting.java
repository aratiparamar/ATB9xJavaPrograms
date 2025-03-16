package Oct.ex_14102024_operatorsP2.typecasting;

public class Lab057_typecasting {
    public static void main(String[] args) {
        //Type casting- changing one varible type into another type
        //widening - Implicit, Explicit-looseless
        //Narrowing - Implicit, Explicit(with data type), loss

        //Widening
        byte b=10;
        int a=b; //valid system-> Implicit casting-done by JVM -POSSIBLE
        //String s=b; only possible with compatible data type
        int a1= (int)b; //Valid- Explicit casting -POSSIBLE

        // Narrowing - converting large data type to small
        int val=200;
        //byte b2= val; Invalid -Implicit - system - NOT POSSIBLE
        byte b3= (byte)val; //Invalid - Explicit- User -POSSIBLE
    }
}
