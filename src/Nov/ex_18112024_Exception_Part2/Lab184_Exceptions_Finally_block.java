package Nov.ex_18112024_Exception_Part2;

public class Lab184_Exceptions_Finally_block {
    public static void main(String[] args) {
        int a= 0;
        int c= 0; //ArithmeticException
        try {
            c = 10/a;
            System.out.println(c);
        } catch (Exception e) { //Also can replace Throwable to "Throwable"
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I will be always executed"); // It will be executed even though there is no Exception
        }
    }
}
