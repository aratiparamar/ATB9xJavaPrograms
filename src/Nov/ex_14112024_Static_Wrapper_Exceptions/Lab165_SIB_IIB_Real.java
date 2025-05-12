package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class Lab165_SIB_IIB_Real {
    public static void main(String[] args) {
        ATB a1=new ATB("Amit");
        ATB a2=new ATB("Het");
        ATB a3=new ATB("Raj");
        ATB a4=new ATB("Mohan");
        new ATB("Rahul");
        a1.readDocuments();
        a2.readDocuments();

        //Static
        //method can be called with class name
        ATB.doAssignment();
        System.out.println(ATB.CourseName);
    }
}

class ATB{
    {
        System.out.println("IIB");
        System.out.println("Reading CSV file");
    }
    static {
        System.out.println("Loading the class? I will execute");
    }

    private String name;
    private String phone;
    static String CourseName="ATB9x"; //common

    public ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non static method");
        System.out.println(CourseName);
    }

    static void doAssignment(){
        //System.out.println(phone); can't access
        System.out.println("Do Assignment");
    }
}

//static class GenAI{
//    //0.001% in Automation
//}