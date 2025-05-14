package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.Vector;

public class Lab202_Vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("Aarti");
        v.add("Aarti");
        v.add("Reha");
        v.add("Juhi");
        v.add("Ruby");
        System.out.println(v);
        v.remove("Reha");
        System.out.println(v);
        System.out.println(v.contains("Reha"));
    }
}
