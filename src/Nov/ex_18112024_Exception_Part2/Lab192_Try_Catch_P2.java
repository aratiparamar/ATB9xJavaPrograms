package Nov.ex_18112024_Exception_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab192_Try_Catch_P2 {
    public static void main(String[] args){
        //Throw- checked
        try {
            FileInputStream fileInputStream=new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {
            System.out.println("No File available");
            e.printStackTrace();
        }
        finally {
            System.out.println("EOP");
        }
    }
}
