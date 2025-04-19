package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab071_OddEvenProgram {
    public static void main(String[] args) {
        //Create a program - Take user input
        //Check weather the input is even or odd number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number, I will tell you odd or even: ");
        int num=sc.nextInt();
        //Modulus->  %
        //10%2-> Even-> 0
        //10%2-> Odd->1
        if (num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
