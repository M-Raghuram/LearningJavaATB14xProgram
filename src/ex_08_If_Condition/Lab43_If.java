package ex_08_If_Condition;

public class Lab43_If {
    static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input);
        //convert into integer
        int age = Integer.parseInt(user_input);
        System.out.println(age);
        if (age>18){
            System.out.println("yes you can vote");
        }
    }
}
