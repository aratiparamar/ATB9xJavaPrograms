package Oct.ex_22102024_while;

import java.util.Scanner;

public class Lab107 {
    public static void main(String[] args) {
        // Take the user input for age and print the output
        // 30,29,....1
        String arg_age_string = args[0];
        //String->int
        int age = Integer.parseInt(arg_age_string);
        //System.out.println(age);

        while (age > 0) {
            System.out.println(age);
            age--;
        }
    }
}
