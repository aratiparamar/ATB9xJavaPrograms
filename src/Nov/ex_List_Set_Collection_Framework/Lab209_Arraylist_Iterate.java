package Nov.ex_List_Set_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab209_Arraylist_Iterate {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Orange");
        mylist.add("Apple");
        mylist.add("Banana");

        System.out.println("------------------To print Arraylist-1----------------");
        for(String str: mylist){
            System.out.println(str);
        }

        System.out.println("-----------------To print Arraylist-2-----------------");
        for(int i=0; i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("-----------------To print Arraylist-3-----------------");
        Iterator<String> iterator=mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
