package LabWork20;

public class Task4 {
    public static void main(String[] args) {
        Calculator.sum(2, 2);
        Calculator.multiply(4, 6);
        Calculator.subtract(23, 3);
    }

    static class Calculator {
        public static <T extends Number> void sum(T a, T b) {
            System.out.println(a.doubleValue() + b.doubleValue());
        }

        public static <T extends Number> void multiply(T a, T b) {
            System.out.println(a.doubleValue() * b.doubleValue());
        }

        public static <T extends Number> void divide(T a, T b) {
            System.out.println(a.doubleValue() / b.doubleValue());
        }

        public static <T extends Number> void subtract(T a, T b) {
            System.out.println(a.doubleValue() - b.doubleValue());
        }
    }
}
