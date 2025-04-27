package Oct.ex_24102024;

import java.util.Scanner;

public class Lab117 {
    public static void main(String[] args) {
        // Create a function of addition, Substration, Multiplication, Division
        // Call all the functions and print the values
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a=scanner.nextInt();
        System.out.println("Enter the number 2");
        int b=scanner.nextInt();

        int result=sum_of_numbers(a,b);
        System.out.println("Sum is-> "+result);

        int result_sub=sub_of_numbers(a,b);
        System.out.println("Sub is-> "+result_sub);

        int result_mul= mul_of_numbers(a,b);
        System.out.println("Multiplication is-> "+result_mul);

        int result_mod= mod_of_numbers(a,b);
        System.out.println("Modulus is-> "+result_mod);

        int result_div= div_of_numbers(a,b);
        System.out.println("Division is-> "+result_div);

        scanner.close();
    }

    static int div_of_numbers(int a, int b) {
        if(b==0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }else{
            return a / b;
        }
    }

    static int mod_of_numbers(int a, int b) {
        return a%b;
    }
    static int mul_of_numbers(int a, int b) {
        return a*b;
    }
    static int sub_of_numbers(int a, int b) {
        return a-b;
    }
    static int sum_of_numbers(int a, int b) {
        return a+b;
    }
}
