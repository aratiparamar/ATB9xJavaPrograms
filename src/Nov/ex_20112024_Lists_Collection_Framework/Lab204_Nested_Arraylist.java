package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab204_Nested_Arraylist {
    public static void main(String[] args) {
        List fruits1=new ArrayList();
        fruits1.add("Orange");
        fruits1.add("Apple");
        fruits1.add("Banana");
        System.out.println(fruits1);

        List fruits2=new ArrayList();
        fruits2.add("Cheery");
        fruits2.add("Mango");
        fruits2.add("Pineapple");
        System.out.println(fruits2);

        List all_fruits=new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        System.out.println(all_fruits);
    }
}
