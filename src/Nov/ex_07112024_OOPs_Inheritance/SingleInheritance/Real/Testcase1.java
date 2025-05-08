package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.Real;

public class Testcase1 extends Common_BaseTest {
    Testcase1(){
        System.out.println("DC of child");
    }
    void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
