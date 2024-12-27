package Oct.ex_10102024_Constants_Literals;

public class Lab030 {
    int i_age; //instance variable- Default value added
    static int s_age; //static variable- Default value added

    public static void main(String[] args) {
        int age; //default value of local variable is not assigned by the JVM- error
        age = 100;
        System.out.println(age);
        //System.out.println(i_age); - not accessible in static method
        System.out.println(s_age);
    }
}
