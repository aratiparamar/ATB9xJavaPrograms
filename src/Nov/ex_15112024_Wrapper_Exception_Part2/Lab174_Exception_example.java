package Nov.ex_15112024_Wrapper_Exception_Part2;

public class Lab174_Exception_example {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip=args[0]; //nothing-> ArrayIndexOutOfbound
        int a=Integer.parseInt(ip);
        int b=1000/a; //0-> ArithmeticException, aarti-> NumberFormatException
        System.out.println(b);

        System.out.println("End of the program");

    }
}
