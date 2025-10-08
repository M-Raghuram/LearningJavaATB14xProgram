package ex_09_Switch;

import java.util.Scanner;

public class Lab52_Real_Switch_Automation {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        switch (browser){
            case "Chrome":
                System.out.println("Starting Chrome");
                System.out.println("....");
                System.out.println("Tc1");
                System.out.println("Tc2");
                break;
            case "Firefox":
                System.out.println("Starting Firefox");
                break;
            case "edge":
                System.out.println("Starting edge");
                break;
        }
    }
}
