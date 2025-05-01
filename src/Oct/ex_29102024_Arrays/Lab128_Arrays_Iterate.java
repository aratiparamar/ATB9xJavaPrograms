package Oct.ex_29102024_Arrays;

import java.util.Arrays;

public class Lab128_Arrays_Iterate {
    public static void main(String[] args) {
      int []marks={60,20,30,90,50,80,70};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);

        System.out.println("===============================");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks); // After sorting, the array is sorted in ascending order
        System.out.println("===============================");
        int item_index=Arrays.binarySearch(marks, 90);
        System.out.println(item_index);
    }
}
