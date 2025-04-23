package Oct.ex_18102024_Ifcondition_Switch;

public class Lab080 {
    public static void main(String[] args) {
        //JDK>13
            int itemcode=003;
            switch(itemcode){
                case 001,002,003:
                    System.out.println("All of them are electronic Gadget");
                    break;
                case 004,005,006:
                    System.out.println("This is Mech");
                    break;
                default:
                        System.out.println("None");
            }
    }
}
