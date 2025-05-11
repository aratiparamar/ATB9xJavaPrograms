package Nov.ex_11112024_Encapsulation_Part2;

import Nov.ex_11112024_Encapsulation_Part2.Real.Baseclass;
import Nov.ex_11112024_Encapsulation_Part2.Real.Testcase1;

public class Lab154_Encap_AccessModifier {
    public static void main(String[] args) {
        Testcase1 tc1=new Testcase1(); //Dynammic Dispatch
        tc1.setBrowser("Chrome",true);
        tc1.startTestcase1();
    }
}
