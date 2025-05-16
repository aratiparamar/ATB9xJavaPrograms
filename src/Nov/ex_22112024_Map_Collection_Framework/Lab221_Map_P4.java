package Nov.ex_22112024_Map_Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab221_Map_P4 {
    public static void main(String[] args) {
        HashMap<String,String> student1=new HashMap();
        student1.put("Name","Aarti");
        student1.put("Phone number", "9865755566");
        student1.put("Address", "Ahmedabad");
        System.out.println(student1);

        HashMap<String,String> student2=new HashMap();
        student2.put("Name", "Ruby");
        student2.put("Phone number", "64654565233");
        student2.put("Address", "Mumbai");
        System.out.println(student2);

        List students=new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
