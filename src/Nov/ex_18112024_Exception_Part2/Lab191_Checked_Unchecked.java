package Nov.ex_18112024_Exception_Part2;
//Important
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab191_Checked_Unchecked {
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Unchecked");
        }

        try{
            FileReader f=new FileReader(new File("C://abc/txt"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Checked");
        }
    }
}
