package ex_05_TypeCasting;

public class lab31_Typecasting_howUsed {
    static void main() {
        int course = 100;
        float GST = 18.45f;
        int total = course + (int)GST;
        System.out.println(total);
        float total2 = course+GST;
        System.out.println(total2);
    }
}
