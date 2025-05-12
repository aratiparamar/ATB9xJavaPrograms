package Nov.ex_14112024_Static_Wrapper_Exceptions;

import java.awt.*;

public class Lab170_Enum_Colors {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getHexcode());
        if(Colors.RED.getHexcode()=="#FF0000"){
            System.out.println("Color is Red");
        }
    }
}

enum Colors{

    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00"),
    WHITE("#FFFFFF"),
    BLACK("#000000");

    private String hexcode;
    Colors(String hexcode){
        this.hexcode = hexcode;
    }

    String getHexcode(){
        return this.hexcode;
    }
}
