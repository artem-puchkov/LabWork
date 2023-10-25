package LabWork18;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("ArithmeticException was thrown");
        }
    }
}
