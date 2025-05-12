package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class Lab163_Static {
    public static void main(String[] args) {
        student s1=new student(23);
        student s2=new student(22);
//        student s3=new student();
//        student s4; //no IIB call
        //s1.age=10;
        System.out.println(student.school_name);
        student.school_name="XYZ";
        System.out.println(student.school_name);
        System.out.println(s1.school_name);
        System.out.println(s2.school_name);
    }
}


class student{
    int age; //Non static variable or Instance variable
    static String school_name="ABC"; //static variable or class variable

    public student(int age){
        this.age = age;
    }

    {
        System.out.println("Instance Initialization block-IIB");
        System.out.println("Here you can write a code you want to");
        System.out.println("Read mySQL DB()");
    }

    static{
        System.out.println("Static Initialization block-SIB");
        System.out.println("Loaded once when class is loaded");
        System.out.println("Read the excel file");
    }

}