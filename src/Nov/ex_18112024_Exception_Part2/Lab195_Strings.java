package Nov.ex_18112024_Exception_Part2;

public class Lab195_Strings {
    public static void main(String[] args) {
//        String a="a";
//        String b="b";
//        String c=a+b;
//        System.out.println(c);

        try {
            int a=10/0;
        } catch (Exception e) {
            //e.printStackTrace(); -> red error
            //System.out.println(e.getMessage());-> Black font error
            System.out.println("Div by zero"); //custom
        }
    }
}
