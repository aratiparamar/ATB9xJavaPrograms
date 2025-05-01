package Oct.ex_25102024_Strings;

public class Lab120_Strings_Created {
    public static void main(String[] args) {
        String name="Aarti";
        name="Parmar";
        name="AartiParmar";
        name="Aarti"; //-> Point to previous one & total 3 strings created
        System.out.println(name);
        //String-> Data type
        //name-> Reference variable
        //Aarti-> Literal (String)


        String name2=new String("Aarti"); // 2 Strings created
        String name3=new String("Aarti");
        String name4=name2; //point to same
        //new String-> Object
        //String-> Class
        //S1,S2-> Objects
    }
}
