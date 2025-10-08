package ex_09_Switch;

import java.util.Scanner;

public class Lab49_Switch {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 - 7");
        //int age = scanner.nextInt();

        if (scanner.hasNext()){
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Please enter 1-7 my dear");

            }



        }else {
            System.out.println("Enter Integer you Fool!");
        }

    }
}
