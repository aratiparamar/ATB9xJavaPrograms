package Nov.ex_15112024_Wrapper_Exception_Part2;

public class Lab175_Exception_example_Problem {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip=args[0]; //nothing-> ArrayIndexOutOfbound
        int a=Integer.parseInt(ip);
        int b=1000/a; //0-> ArithmeticException, aarti-> NumberFormatException
        System.out.println(b);

        System.out.println("End of the program");

        //JVM will be initialized (From RAM)
        //Creates and start the main thread - Main called
        //1) collects the command line arguments-10
        //String[] args= {10}
        //2) Lab174_Exception.main()
        //Now control will be transferred from main thread main method
        //when problem comes in main-> JVM handles it-> terminates the program with exception
    }
}
