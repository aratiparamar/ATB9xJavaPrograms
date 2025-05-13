package Nov.ex_15112024_Wrapper_Exception_Part2;

import java.io.FileInputStream;

public class Lab176_Exceptions {
    public static void main(String[] args) {
        //Checked- JCM Knows it
//        FileInputStream file=new FileInputStream("C://a.txt");
        //JVM knows about it and convert to red line


        //Unchecked- JCM doesn't know it
        int a=10;
        int b=10;
        b=0;
        int c=a/b   ;
        System.out.println(c);
    }
}
