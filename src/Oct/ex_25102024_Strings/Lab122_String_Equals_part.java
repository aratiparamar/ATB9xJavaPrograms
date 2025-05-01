package Oct.ex_25102024_Strings;

public class Lab122_String_Equals_part {
    public static void main(String[] args) {
        String s1="Hello"; //SCP- String Constant Pool
        String s4="Hello"; //1 string 2 references
        String s2=new String("Hello"); //OA-Object Area
        String s3=new String("hello"); //2 strings

        System.out.println(s1==s2); //compare Strings
        System.out.println(s1==s4);
        System.out.println(s2==s3);

        System.out.println("=================================");

        System.out.println(s1.equals(s2)); //compare values
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
