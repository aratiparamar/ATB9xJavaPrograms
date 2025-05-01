package Oct.ex_29102024_Arrays;

import java.util.Scanner;

public class Lab130_Arrays_userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int [] numbers=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number "+ (i+1));
            numbers[i]=sc.nextInt();
        }
        System.out.println("================================"); //Print

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }
}
