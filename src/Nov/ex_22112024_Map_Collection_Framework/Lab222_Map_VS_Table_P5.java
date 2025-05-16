package Nov.ex_22112024_Map_Collection_Framework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab222_Map_VS_Table_P5 {
    public static void main(String[] args) {
        //Hash Map-key value pair-> allow null values

        //Hashtable-Synchronized, slow & legacy class
        //T1,T2-use one by one
        //Null value not allowed
        Hashtable<Integer,String> ht1=new Hashtable();
        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");
        //ht1.put(4,null); //NullPointerException
        //ht1.put(null,"Five"); //NullPointerException
        System.out.println(ht1);

        System.out.println("---------------------------");

        HashMap<Integer,String> ht2=new HashMap<>();
        ht2.put(1,"One");
        ht2.put(2,"Two");
        ht2.put(3,"Three");
        ht2.put(null,null);
        System.out.println(ht2);

        Enumeration<Integer> e=ht1.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
            //System.out.println(ht1.get(e.nextElement()));

            //important in collection- Hashmap, hashset and Arraylist
        }

    }
}
