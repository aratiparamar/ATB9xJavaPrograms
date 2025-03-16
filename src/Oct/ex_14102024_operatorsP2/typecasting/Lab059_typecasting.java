package Oct.ex_14102024_operatorsP2.typecasting;

public class Lab059_typecasting {
    public static void main(String[] args) {
        //GST 18.45 %
        int course=100;
        float GST= 18.45f;
        int total_price= course+ (int)GST; //Narrowing-> Explicit
        System.out.println(total_price);
        //loss by 0.45
    }
}
