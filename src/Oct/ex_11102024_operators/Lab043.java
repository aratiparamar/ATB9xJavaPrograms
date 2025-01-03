package Oct.ex_11102024_operators;

import java.sql.SQLOutput;

public class Lab043 {
    public static void main(String[] args) {
        String first_name= "Aarti";
        String last_name= "Parmar";
        int a=10;
        int b=20;
        System.out.println(first_name+last_name+a+b);
        //first operator performed as concatination
        System.out.println(first_name+last_name+(a+b)); //fixed via BODMAS concept
        System.out.println(a+b+first_name+last_name);
        // maths operator- follow
    }
}
