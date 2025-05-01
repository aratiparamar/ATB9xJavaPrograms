package Oct.ex_28102024_String_Functions_Arrays;

public class Lab124_StringBuffer_Builder {
    public static void main(String[] args) {
        StringBuffer stringbuffer=new StringBuffer("Aarti");
        stringbuffer.append("Parmar");
        System.out.println(stringbuffer);
        stringbuffer.reverse();
        System.out.println(stringbuffer);

        StringBuilder stringbuilder=new StringBuilder("Aarti");
        stringbuilder.append("Rao");
        System.out.println(stringbuilder);
    }
}
