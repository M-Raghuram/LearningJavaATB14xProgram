package ex_06_Ternary_Operator;

public class lab36_Task20th_Zeta_InterviewQuestion {
    static void main(String[] args) {
        //Interview - Zeta → (AT) Ter nested → Max between 3 numbers →  int n1 = 2; int n2 = 9;  int n3 = -11;
        int n1 = 2;
        int n2 = 99;
        int n3 = 11;
        String result = (n1 > n2) ? ((n1 > n3) ? "Max is n1" : "Max is n3") : ((n2 > n3) ? "Max is n2" : "Max is n3");
        System.out.println(result);
    }
}
