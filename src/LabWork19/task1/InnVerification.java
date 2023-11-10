package LabWork19.task1;

import java.util.Scanner;

public class InnVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter INN number");
            try {
                String inn = sc.nextLine();
                isInnValid(inn);
                break;
            } catch (NotValidInnException e) {
                System.out.println(e.getMessage());
            } finally {
                sc.close();
            }
        }
        System.out.println("INN is valid!");
    }

    public static boolean isInnValid(String inn) throws NotValidInnException {
        if (inn == null || inn.length() != 10) {
            throw new NotValidInnException(inn);
        }

        return true;
    }
}
