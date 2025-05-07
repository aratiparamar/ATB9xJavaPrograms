package Nov.ex_05112024_OOPs;

public class Lab139_OOPs_Object_Class {
    public static void main(String[] args) {
        StudentsATB s1 = new StudentsATB();
        s1.name="Aarti"; //A
        s1.eat(10); //B
        System.out.println(s1);
        //StudentsATB-> Class
        //s1-> Reference Variable
        //new-> new keyword
        //StudentsATB()-> Object creation/Constructor

        StudentsATB s2 = new StudentsATB();
        s2.name="Krishna"; //A
        s1.eat(20); //B
        System.out.println(s2);
        Person p1;
        // Person-> Class loaders
        // p1-> reference- null
        // Byte, bits-> 8,64
    }
}
