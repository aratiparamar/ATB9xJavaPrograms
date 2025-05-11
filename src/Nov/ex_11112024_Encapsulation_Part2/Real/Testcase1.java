package Nov.ex_11112024_Encapsulation_Part2.Real;

public class Testcase1 extends Baseclass{
    public Testcase1(){
        super(); //Parent constructor
        // this->current object
        System.out.println("DC-Testcase1");
    }
    public void startTestcase1(){
        System.out.println("Start Testcase1");
        openBrowser("chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own logic");
        super.setBrowser(browser, isAuth);
    }
}
