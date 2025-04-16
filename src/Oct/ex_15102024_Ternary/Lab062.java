package Oct.ex_15102024_Ternary;

public class Lab062 {
    public static void main(String[] args) {
        //Nested Ternary
        //result=condition1 ? expression1 : (condition2 ? expression2 : expression3)
        //Grade - System - Score>= 90 -> A
        //Grade - System - Score>= 80 -> B
        //Grade - System - Score>= 70 -> C
        //Grade - System - Score>= 60 -> D
        //Grade - System - Score < 60 -> F

        int score=95;
        String grade = (score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F";
        System.out.println("Your Grade is -> "+grade);
        System.out.printf("Your Grade is %s", grade);
    }
}
