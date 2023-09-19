package LabWork3.MathAndRandom;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        RandomGeneration randomGeneration = new RandomGeneration();

        randomGeneration.mathRandom();

        randomGeneration.classRandom();
    }
}

class RandomGeneration {
    public void mathRandom() {
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }

        System.out.println("Массив с использованием Math.random(): " + Arrays.toString(array));
        System.out.println("");

        Arrays.sort(array);

        System.out.println("Отсортированный массив с использованием Math.random(): " + Arrays.toString(array));
        System.out.println("");
    }

    public void classRandom() {
        double[] array = new double[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 100;
        }

        System.out.println("Массив с использованием класса Random: " + Arrays.toString(array));
        System.out.println("");

        Arrays.sort(array);

        System.out.println("Отсортированный массив с использованием класса Random: " + Arrays.toString(array));
        System.out.println("");
    }
}
