package Nov.ex_22112024_Map_Collection_Framework;
import java.util.Map;
import java.util.HashMap;
//import java.util.*; Import all modules, Don't do it. It will slow down the code

public class Lab217_Map_P1 {
    public static void main(String[] args) {
        //Map-> Key & value pair
        //name: Aarti, roll no: 1
        //Phone no: 9328991852
        Map m1=new HashMap(); //Generic
        //Map<String,Object> m1=new HashMap(); Data type fixed
        m1.put("name","Aarti");
        m1.put("roll no", 1);
        m1.put("phone no", 9328991852l);
        System.out.println(m1);

        //When to use list or Map
        //Shopping list_> single item-> list
        //Student data-> multi item-> Map
    }
}
