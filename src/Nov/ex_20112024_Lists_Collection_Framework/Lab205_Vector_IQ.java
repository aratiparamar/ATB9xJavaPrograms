package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Lab205_Vector_IQ {
    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
