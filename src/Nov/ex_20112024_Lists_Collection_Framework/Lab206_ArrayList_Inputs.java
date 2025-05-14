package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab206_ArrayList_Inputs {
    public static void main(String[] args) {
        //multiple inputs from user and store in arraylist
        //create arraylist
        //name,ages-> Store
        Scanner sc=new Scanner(System.in);

        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> ages=new ArrayList<>();

        String continueInput="Y"; //Control variable for input loop

        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter name");
            String name=sc.next();
            names.add(name);

            System.out.println("Enter age");
            int age=sc.nextInt();
            ages.add(age);

            System.out.println("Do you want to continue? (Y/N)");
            continueInput=sc.next();
        }
        //Displaying the collected data
        System.out.println("Names: "+names);
        System.out.println("Ages: "+ages);

        for(Object o1: names){
            System.out.println(o1);
        }
        for(Object o2: ages){
            System.out.println(o2);
        }

        sc.close();
    }
}
