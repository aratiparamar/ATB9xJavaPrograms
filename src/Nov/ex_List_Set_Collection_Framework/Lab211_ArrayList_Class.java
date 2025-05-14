package Nov.ex_List_Set_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab211_ArrayList_Class {
    public static void main(String[] args) {
        Student s1=new Student("101","Ravi");
        Student s2=new Student("102", "Raj");
        Student s3=new Student("103", "Rahul");

        List<Student> mylist=new ArrayList<>();
        mylist.add(s1);
        mylist.add(s2);
        mylist.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

        System.out.println(mylist);
    }
}
