package LabWork2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        int counter = countWords(inputText);

        System.out.println("Количество слов: " + counter);
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split(" ");

        return words.length;
    }
}
