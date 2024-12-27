package Oct.ex_10102024_Constants_Literals;

public class Lab035 {
    public static void main(String[] args) {
        // char literals
        char c1= 'A';
        char c2= 'B';
        char c3= '@';

        // Escape char
        char new_line= '\n';
        char tab_line= '\t';
        char backspace= '\b';
        char car_r= '\r'; //delete the previous word

        System.out.println("Aarti" +new_line+ "Parmar");
        //System.out.println("Aarti" + "Parmar");
        System.out.println("Aarti" +tab_line+ "Parmar");
        System.out.println("Aarti" +backspace+ "Parmar");
        System.out.println("Aarti" +car_r+ "Parmar");

        char c11= '\u1F60';
        // ASCII -> limited charactes
        // Unicode- Japan, China
    }
}
