package Nov.ex_11112024_Encapsulation_Part2.Police;

public class Cop {
    private int gun;
    public String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot() {
        if (gun > 0) {
            System.out.println("Yes, you can shoot");
        } else {
            System.out.println("No, you can't shoot");
        }
    }
}

