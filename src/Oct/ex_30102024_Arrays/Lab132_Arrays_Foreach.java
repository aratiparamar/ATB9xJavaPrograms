package Oct.ex_30102024_Arrays;

public class Lab132_Arrays_Foreach {
    public static void main(String[] args) {
        int[] a=new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        System.out.println("===========================================");
        for (int i:a){
            System.out.println(i);
        }

        System.out.println("===========================================");

        String[] names={"A","B","C"};
        for(String name:names) {
            System.out.println(name);
        }

        System.out.println("===========================================");

        int[] numbers={1,2,3,4,5};
        for(int n:numbers) {
            System.out.println(n);
        }
    }
}
