package Oct.ex_18102024_Ifcondition_Switch;

import java.util.Scanner;

public class Lab076_SwitchWithoutBreak {
    public static void main(String[] args) {
        // Switch Condition
        // User-Enter int number from 1 to 7
        // Which day it is
        // 1-> Mon, 7-> Sun, 8-> Invalid
        // Incorrect - must use break
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from(1-7)");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("No idea, what day its");
        }
        System.out.println("End of the loop");
        sc.close();
    }
}
