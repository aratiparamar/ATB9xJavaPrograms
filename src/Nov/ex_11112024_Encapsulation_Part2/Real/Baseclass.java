package Nov.ex_11112024_Encapsulation_Part2.Real;

public class Baseclass {
    private String browser;

    Baseclass(){
        System.out.println("DC-Base class");
    }

    Baseclass(String b){
        System.out.println("CC-Base class");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {
        if(isAuth) {
            this.browser = browser;
        }
        else{
            System.out.println("Not Auth");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser");
    }
    void openBrowser(String browserName){
        System.out.println("Open Browser!! -> " +browserName);
    }
    void closeBrowser(){
        System.out.println("Closing Browser");
    }
}
