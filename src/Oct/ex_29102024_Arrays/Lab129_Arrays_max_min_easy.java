package Oct.ex_29102024_Arrays;

import java.util.Arrays;

public class Lab129_Arrays_max_min_easy {
    public static void main(String[] args) {
        int[] array={25,14,56,15,36,56,77,18,29,49};
        Arrays.sort(array);
        System.out.println(array[0]); //min
        System.out.println(array[array.length-1]); //max
    }

}
