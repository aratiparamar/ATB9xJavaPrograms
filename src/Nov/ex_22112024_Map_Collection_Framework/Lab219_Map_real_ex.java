package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab219_Map_real_ex {
    public static void main(String[] args) {
        Map<String, Object> student1 = new HashMap<>();
        student1.put("Name", "Aarti");
        student1.put("Phone number", "9865755566");
        student1.put("Address", "Ahmedabad");

        Set book_items=new HashSet();
        book_items.add("Rich Dad Poor Dad");
        book_items.add("Secret");
        book_items.add("5 AM Club");
        book_items.add("Atomic Habits");
        book_items.add("5 AM Club");
    }
}
