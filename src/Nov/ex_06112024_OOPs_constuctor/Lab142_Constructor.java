package Nov.ex_06112024_OOPs_constuctor;

public class Lab142_Constructor {
    public static void main(String[] args) {
        Car tesla=new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car nano=new Car();
        nano.name="Nano";
        System.out.println(nano.name);
    }
}
