package LabWork2;

public class Task3 {
    public static void main(String[] args) {
        Point point = new Point(2.0, 6.0);

        Circle circle = new Circle(point, 3.0);

        Tester tester = new Tester(1);
        tester.addCircle(circle);

        tester.printCircles();
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
}
