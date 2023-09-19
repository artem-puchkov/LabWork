package LabWork3.MathAndRandom;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Tester tester = new Tester(2);

        for (int i = 0; i < 2; i++) {
            double x = random.nextDouble() * 10;
            double y = random.nextDouble() * 10;
            double radius = random.nextDouble() * 5;

            Point center = new Point(x, y);

            Circle circle = new Circle(center, radius);

            tester.addCircle(circle);
        }

        System.out.println("Все окружности:");
        tester.printCircles();

        Circle smallestCircle = tester.findSmallestCircle();
        System.out.println("Самая маленькая окружность, окружность с радиусом: " + smallestCircle.getRadius());

        Circle largestCircle = tester.findLargestCircle();
        System.out.println("Самая большая окружность, окружность с радиусом: " + largestCircle.getRadius());
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}

class Tester {
    private Circle[] circles;
    private int number;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        number = 0;
    }

    public void addCircle(Circle circle) {
        if (number < circles.length) {
            circles[number] = circle;
            number++;
        } else {
            System.out.println("Массив полон, добавить больше элементов нельзя");
        }
    }

    public void printCircles() {
        for (int i = 0; i < number; i++) {
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.println("    Центр: " + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + "");
            System.out.println("    Радиус: " + circles[i].getRadius());
        }
    }

    public Circle findSmallestCircle() {
        Circle smallestCircle = circles[0];

        for (int i = 1; i < number; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }

        return smallestCircle;
    }

    public Circle findLargestCircle() {
        Circle largestCircle = circles[0];

        for (int i = 1; i < number; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }

        return largestCircle;
    }
}