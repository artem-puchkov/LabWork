package LabWork18;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("ArithmeticException was thrown");
        } finally {
            myScanner.close();
            System.out.println("Program is over");
        }
    }
}
