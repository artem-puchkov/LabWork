package LabWork2;

public class Task6 {
}

class Ccircle {
    private double radius;

    public Ccircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean compareCircles(Ccircle otherCircle) {
        if (otherCircle == null) {
            return false;
        }
        return Double.compare(radius, otherCircle.getRadius()) == 0;
    }

    @Override
    public String toString() {
        return "Ccircle{" +
                "radius=" + radius +
                '}';
    }
}

class TestCircle {
    public static void main(String[] args) {
        Ccircle circle1 = new Ccircle(3.0);
        Ccircle circle2 = new Ccircle(8.0);

        System.out.println("Площадь круга первой окружности: " + circle1.calculateArea());
        System.out.println("Длина окружности круга первой окружности: " + circle1.calculateCircumference());

        System.out.println("Площадь круга второй окружности: " + circle2.calculateArea());
        System.out.println("Длина окружности круга второй окружности: " + circle2.calculateCircumference());

        if (circle1.compareCircles(circle2)) {
            System.out.println("Круги имеют одинаковый радиус.");
        } else {
            System.out.println("Круги имеют разные радиусы.");
        }
    }
}