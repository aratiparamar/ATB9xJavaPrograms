package Nov.ex_18112024_Exception_Part2;

public class Lab188_Multiple_Try {
    public static void main(String[] args) {
        System.out.println("Start of the Program");

        String ip=null; //ArrayIndexOutOfBoundsException
        try {
            ip=args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        int a=0; //Number Format Exception
        try {
            a=Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        int b=0; //Arithmetic Exception
        try {
            b=1000/a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b);
        System.out.println("End of the Program");
    }
}
