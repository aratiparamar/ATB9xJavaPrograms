package Oct.ex_23102024_Functions;

public class Lab114 {
    public static void main(String[] args) {
        //User defined functions
        //Without parameter  and without return type
        greet();
        //        for (int i = 0; i < 10; i++) {
        //            greet();
        //        }
        //Without parameter and with return type
        String returned_value = greet_with_hello();
        System.out.println(returned_value);

        int voting_age = age_of_vote();
        System.out.println(voting_age);
        if (voting_age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
        //With parameter and without return type
        greet_with_your_name("Aarti");
        greet_with_your_name("Krishna");
        greet_with_first_name_last_name("Aarti", "Parmar");
        //With parameter and with return type
        int sum = sum_of_two_numbers(3, 4);
        System.out.println(sum);
    }

    //==========================================================================================
    //Without parameter  and without return type
    static void greet() {
        System.out.println("Hello World");
    }

    //Without parameter and with return type
    static String greet_with_hello() {
        System.out.println("Hello");
        return "Hi, You are awesome";
    }
    static int age_of_vote() {
        System.out.println("Vote age returned!");
        return 18;
    }

    //With parameter and without return type
    static void greet_with_your_name(String name) {
        System.out.println("Hi, Your name is " + name);
    }
    static void greet_with_first_name_last_name(String firstname, String lastname) {
        System.out.println("Hi Your name is " + firstname + " " + lastname);
    }

    //With parameter and with return type
    static int sum_of_two_numbers(int a, int b) {
        return a + b;
    }
}
