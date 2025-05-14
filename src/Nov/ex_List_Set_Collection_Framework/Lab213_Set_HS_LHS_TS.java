package Nov.ex_List_Set_Collection_Framework;

import java.util.*;

public class Lab213_Set_HS_LHS_TS {
    public static void main(String[] args) {
        //Hash mechanism to store element, no order, no duplicates
        Set hs=new HashSet();

        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Banana");
        hs.add(null);
        //hs.add(null);
        System.out.println(hs);


        Set  lhs=new LinkedHashSet();
        //Linked list mechanism to store element
        //order will maintain, no duplicates
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Orange");
        lhs.add("Banana");
        lhs.add("Cheery");
        lhs.add(null);
        System.out.println(lhs);

        Set ts=new TreeSet();
        //Black and Red tree mechanism to store element
        //order will maintain, natural sorting will be done
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Orange");
        ts.add("Watermelon");
        //ts.add(null); //NullPointerException
        //ts.add(123); //ClassCastException
        System.out.println(ts);

        for(Object o:ts){
            System.out.println(o);
        }
    }
}
