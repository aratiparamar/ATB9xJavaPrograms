package Nov.ex_08112024_Encapsulation;

public class Lab153 {
    public static void main(String[] args) {
        Person p1=new Person("Aarti","1234567890");
        p1.getName();
        p1.setName("Aarti");
        //p1.name; Can not access directly because it is private.
       
    }
}

class Person{
    private String name;
    private String phone_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public Person(String name, String phone_no){
        this.name=name;
        this.phone_no=phone_no;
    }
}
