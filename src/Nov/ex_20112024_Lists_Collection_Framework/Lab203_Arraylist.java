package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_Arraylist {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("bread");
        list.add("butter");
        list.add("jam");
        list.add("milk");
        list.add("paneer");
        list.add("cheese");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));

        System.out.println("----------------Default for loop--------------");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("----------------for each loop--------------");
        for(Object o: list){
            System.out.println(o);
        }

        System.out.println("----------------To Print Arraylist Iterator--------------");
        //Iterator - Anchor - go one by one forward-> Get access to them
        //Hashnext()-> true if we have next element
        //next-> element

        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
