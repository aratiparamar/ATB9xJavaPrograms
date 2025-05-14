package Nov.ex_18112024_Exception_Part2;
import java.util.Scanner;

public class Lab185_Finally_Explain {
    public static void main(String[] args) {
        Scanner sc=null;
        sc = new Scanner(System.in);
        int v=sc.nextInt();
        try {
            int a=10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
            System.out.println("Closing sc");//It will be executed even though there is no Exception
        }
    }
}
