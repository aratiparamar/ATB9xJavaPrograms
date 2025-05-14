package Nov.ex_18112024_Exception_Part2;

public class Lab181_Exceptions_Average_Coder {
    public static void main(String[] args) {
        int a=0;
        int c= 0; //ArithmeticException
        try {
            c = 10/a;
        } catch (Exception e) { //Also can replace Throwable to "Throwable"
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
