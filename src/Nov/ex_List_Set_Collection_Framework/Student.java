package Nov.ex_List_Set_Collection_Framework;

public class Student {
    private String name;
    private String rollno;

    public Student(String rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    public void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Rollno: "+this.rollno);
    }
}
