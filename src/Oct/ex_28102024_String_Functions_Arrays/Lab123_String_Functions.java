package Oct.ex_28102024_String_Functions_Arrays;

public class Lab123_String_Functions {
    public static void main(String[] args) {
        String anotherPalindrome="Niagara. O roar again!";
        String roar=anotherPalindrome.substring(11,15); //Start from 0- prints 11 to 14 char
        System.out.println(roar);

        //Concat
        String s1="Aarti";
        String s2=s1.concat("Parmar");
        System.out.println(s2);

        String fruits="aaple,banana,cherry"; //delimeter
        String[] split_fruits=fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2="ABC-XYZ-QWE";
        String[] split_fruits2=fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);

        String s4="Aarti";
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10));

        String s5="   Aarti  ";
        System.out.println(s5.trim());

        String s6="Aarti";
        System.out.println(s6.indexOf("r"));
        System.out.println(s6.indexOf("i"));

        String s7="Aarti";
        System.out.println(s7.contains("ra"));
        System.out.println(s7.contains("hh"));

        String s8="AartiParmar";
        System.out.println(s8.lastIndexOf("r")); //returns the last char's index

        String s9="AartiParmar";
        System.out.println(s9.replace("A","z"));

        String s10="AartiParmarji";
        System.out.println(s10.startsWith("Aar"));
        System.out.println(s10.endsWith("ji"));
        System.out.println(s10.endsWith("JI"));

        String original="banana";
        String result1=original.replace('a', 'o');
        System.out.println(result1);

        String Original1="Hello123 World456!";
        String result2=Original1.replaceAll("\\d+", "");
        System.out.println(result2);

        String result3=Original1.replaceAll("o", "O");
        System.out.println(result3);
    }
}
