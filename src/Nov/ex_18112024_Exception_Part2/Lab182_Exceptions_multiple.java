package Nov.ex_18112024_Exception_Part2;

public class Lab182_Exceptions_multiple {
    public static void main(String[] args) {
        int a=0;
        int c= 0; //ArithmeticException
        try {
            c = 10/a;
            String s1=null;
            s1.trim();
        } catch (Exception e) { //Also can replace Throwable to "Throwable"
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
