package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab072_If_elseif_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Num1>Num2");
        } else if (num2>num1) {
            System.out.println("Num1<Num2");
        }
        else {
            System.out.println("Equal");
        }
        //=-> Assignment Operator
        //==-> Comparision operator
    }
}
