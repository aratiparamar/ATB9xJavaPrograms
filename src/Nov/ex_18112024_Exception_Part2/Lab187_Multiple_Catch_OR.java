package Nov.ex_18112024_Exception_Part2;

public class Lab187_Multiple_Catch_OR {
    public static void main(String[] args) {
        try {
            String ip=args[0];
            int a=Integer.parseInt(ip);
            int b=100/a;
        } catch (ArithmeticException | NumberFormatException |ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
