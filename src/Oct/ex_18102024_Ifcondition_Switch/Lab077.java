package Oct.ex_18102024_Ifcondition_Switch;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        // Web automation
        // I will ask user which browser you  want me to run the code
        // chrome-> execute chrome
        // firefox-> execute firefox
        // edge-> edge browser
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser=scanner.next();
        browser=browser.toLowerCase();
        switch (browser){
            default:
                System.out.println("I have no idea which browser is this");
                break;
            case "chrome":
                System.out.println("Starting the Chrome");
                System.out.println(".......");
                System.out.println("TC");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "Edge":
                System.out.println("Execute the Edge code");
                break;
        }
    }
}
