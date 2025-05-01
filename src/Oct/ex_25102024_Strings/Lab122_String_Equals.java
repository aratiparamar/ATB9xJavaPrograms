package Oct.ex_25102024_Strings;

public class Lab122_String_Equals {
    public static void main(String[] args) {
        String s1="Hello"; //SCP- String Pool
        String s4="Hello"; //1 string 2 references

        String s2=new String("Hello"); //OA-Object Area
        String s3=new String("Hello"); //2 strings
    }
}
