package Nov.ex_19112024_Why_collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab199_Arraylist {
    public static void main(String[] args) {
        //collection belongs  to interface package-> java.util package
//        Collection list=new ArrayList();
//        List list1=new ArrayList(); //Dynamic Dispatch
        ArrayList list2=new ArrayList();
        list2.add("Aarti");
        list2.add("Aarti"); //Duplicate allowed
        list2.add("Het");
        list2.add("Krisha");
        list2.add("Ruby");
        list2.add(null);
        list2.add(true);
        list2.add(123);

        System.out.println(list2);
    }
}
