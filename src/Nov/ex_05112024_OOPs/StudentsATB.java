package Nov.ex_05112024_OOPs;
// Class C-> StudentsATB
public class StudentsATB {
    //A- Attributes | data members | variables | fields | properties
    String name;
    int age;
    int batch_no;
    long phone_no;
    boolean isMarried;
    String address;
    boolean is_feed_paid;
    String Github_link;
    String sid;
    char grade;

    //B-> Behaviors | methods | functions
    void study(){
        System.out.println("Student is studying");
    }
    void eat(int a){
        System.out.println("Student is eating");
    }
    int walk(){
        System.out.println("Student is walking");
        return 10;
    }
    int walk2(int a){
        System.out.println("Student is walking");
        return 10;
    }
}
