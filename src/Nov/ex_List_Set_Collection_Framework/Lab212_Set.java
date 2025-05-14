package Nov.ex_List_Set_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab212_Set {
    public static void main(String[] args) {
        Set hs=new HashSet();

        Set lhs=new LinkedHashSet();

        Set ts=new TreeSet();

        hs.add("Aarti");
        hs.add("Aarti");
        hs.add("aarti");
        hs.add("Parmar");
        System.out.println(hs);
    }
}
