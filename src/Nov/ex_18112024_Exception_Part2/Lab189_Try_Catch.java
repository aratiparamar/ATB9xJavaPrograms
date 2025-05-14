package Nov.ex_18112024_Exception_Part2;

public class Lab189_Try_Catch {
    public static void main(String[] args) {
        try {
            String s1 = "Aarti";
            String a1 = args[0];
            int a=10/0;
            s1=null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is problem with the code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the Program");
    }
}
