package Nov.ex_18112024_Exception_Part2;

public class Lab186_Multiple_Catch {
    public static void main(String[] args) {
        try {
            String ip=args[0];
            int a=Integer.parseInt(ip);
            int b=100/a;
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");
        }

    }
}
