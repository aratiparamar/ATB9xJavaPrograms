package Nov.ex_18112024_Exception_Part2;

public class Lab194_Custom_Exception {
    public static void main(String[] args) throws Exception {
        bank sbi=new bank("INR",100);
        bank icici=new bank("INR",123);
        System.out.println(sbi.add(icici));

        bank jp_chase=new bank("USD",100);
        System.out.println(sbi.add(jp_chase));
    }
}
