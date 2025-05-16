package Nov.ex_22112024_Map_Collection_Framework;
import java.util.Map;
import java.util.HashMap;

public class Lab218_Map_P2 {
    public static void main(String[] args) {
        //Map<String,Integer> map=new HashMap<String,Integer>(); // All 3 are same
        //Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> map=new HashMap(); //Fixed data type

        //Map map=new HashMap(); //Generic

        map.put("id",1);
        map.put("id",2);//latest value
        map.put("id2",2);
        map.put("id3",36);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null, 3); //only one null key allowed
        //map.put(null, 102);

        System.out.println(map); //never maintain order
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));

    }
}
