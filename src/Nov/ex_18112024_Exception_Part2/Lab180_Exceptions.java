package Nov.ex_18112024_Exception_Part2;

public class Lab180_Exceptions {
    public static void main(String[] args) {
        int a=0;
        int c= 0; //ArithmeticException
        try {
            c = 10/a;
        } catch (ArithmeticException e) { //Also can replace Throwable to "Throwable"
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
