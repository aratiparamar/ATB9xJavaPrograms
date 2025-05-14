package Nov.ex_19112024_Why_collection_Framework;

public class Lab197_Solution {
    public static void main(String[] args) {
        temp_sum(10,20);
        temp_sum("Aarti","Parmar");
        temp_sum(true,false);
        //t-> Any data type
    }

    public static <T>T temp_sum(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}
