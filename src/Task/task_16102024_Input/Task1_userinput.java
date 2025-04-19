package Task.task_16102024_Input;

import java.util.Scanner;

public class Task1_userinput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter your name:");
        String name=scanner.nextLine();

        System.out.println("Enter your age:");
        int age=scanner.nextInt();

        System.out.println("Enter your salary:");
        double salary=scanner.nextDouble();

        //Printing user input

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);

        scanner.close();
    }
}
