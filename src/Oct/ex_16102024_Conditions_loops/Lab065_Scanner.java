package Oct.ex_16102024_Conditions_loops;

import java.util.Scanner;

public class Lab065_Scanner {
    public static void main(String[] args) {
        //Scanner- Class
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Age\n");
        int age= scanner.nextInt();
        //int float=scanner.nextFloat();
        //int double=scanner.nextDouble();
        System.out.println(age>25?"Allowed to Goa":"Not Allowed");
        scanner.close();
    }
}
