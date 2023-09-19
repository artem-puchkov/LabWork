package LabWork3.MathAndRandom;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.print("Массив: " + Arrays.toString(array));
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                System.out.println("Массив не является возрастающим");
                return;
            }
        }

        System.out.println("Массив является возрастающим");
    }
}