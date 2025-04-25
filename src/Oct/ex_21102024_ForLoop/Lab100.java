package Oct.ex_21102024_ForLoop;

public class Lab100 {
    public static void main(String[] args) {
        for (int i=0;i<50;i++) {
            if (i == 5) {
                continue; // skip below code and move to top
            }
            System.out.println(i);
        }
    }
}
