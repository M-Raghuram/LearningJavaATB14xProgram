package ex_09_Switch;

import java.util.Scanner;

public class Lab50_Switch_WithoutBreak {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 - 7");
        //int age = scanner.nextInt();

        if (scanner.hasNext()){
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("monday");

                case 2:
                    System.out.println("Tuesday");

                case 3:
                    System.out.println("wed");
                case 4:
                    System.out.println("thur");

                case 5:
                    System.out.println("Fri");

                case 6:
                    System.out.println("Sat");

                case 7:
                    System.out.println("Sun");

                default:
                    System.out.println("Please enter 1-7 my dear");

            }



        }else {
            System.out.println("Enter Integer you Fool!");
        }

    }
}
