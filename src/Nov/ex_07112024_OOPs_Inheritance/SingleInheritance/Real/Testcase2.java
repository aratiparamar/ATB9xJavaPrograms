package Nov.ex_07112024_OOPs_Inheritance.SingleInheritance.Real;

public class Testcase2 extends Common_BaseTest {
    Testcase2(){
        System.out.println("DC of child");
    }
    void testcase2() {
        System.out.println("Testcase 2 Executing");
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
