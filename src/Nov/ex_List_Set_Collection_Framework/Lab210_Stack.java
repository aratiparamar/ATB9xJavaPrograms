package Nov.ex_List_Set_Collection_Framework;

import java.util.Stack;

public class Lab210_Stack {
    public static void main(String[] args) {
        //Stack
        //Last in-> First out

//        Stack s=new Stack<>();
//        s.add("Aarti");
//        s.add("Parmar");
//        System.out.println(s);

        Stack s=new Stack();
        s.push("Aarti");
        s.push("Ruby");
        s.push("Rahi");
        s.add("Kesha");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Rosy"));
        System.out.println(s);
        s.add("Radhika");
        s.push("Krisha");
        System.out.println(s);
        s.add(0,"Rahul");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
