package Oct.ex_16102024_Conditions_loops;

public class Lab064 {
    public static void main(String[] args) {
        //Create a program wheather Aarti Parmar will go to goa or not
        int age= Integer.parseInt(args[1]);
        System.out.println(age>25?"Allowed to Goa":"Not Allowed");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s,%s,%s",args[0],args[1],args[2]);
    }
}
