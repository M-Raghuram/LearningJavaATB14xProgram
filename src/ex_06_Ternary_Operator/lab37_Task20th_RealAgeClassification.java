package ex_06_Ternary_Operator;

public class lab37_Task20th_RealAgeClassification {
    static void main() {
        int age = 8;
        // Nested Ternary
// result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        String result = (age < 100 & age > 70) ? "Sr citizen" : (age > 59 & age < 70 ?  "Adult": "Minor");
        //age > 59 : adult and sr citizen
        System.out.println(result);
    }
}
