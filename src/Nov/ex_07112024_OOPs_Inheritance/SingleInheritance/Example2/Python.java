package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.Example2;

public class Python extends Programming{
    void print(){
        System.out.println(Author);
        System.out.println(version);
    }
    Python(){
        System.out.println("Python Default Constructor");
    }

    public static void main(String[] args) {
        Python p1=new Python();
        System.out.println(p1.Author);
    }
}


