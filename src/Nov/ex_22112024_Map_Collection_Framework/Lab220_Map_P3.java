package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Lab220_Map_P3 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",36);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null, 3);

        //Iterate
        for(Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey()+" -> "+item.getValue());
        }

    }
}
