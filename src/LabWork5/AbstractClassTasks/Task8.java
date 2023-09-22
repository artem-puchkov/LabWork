package LabWork5.AbstractClassTasks;

public class Task8 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2, 7);
        Square square = new Square(3);

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(square);
    }
    public static void printShapeInfo(Shape shape) {
        System.out.println(shape);
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println();
    }
}

abstract class Shape {

    protected String color;
    protected boolean field;

    public Shape() {
    }

    public Shape(String color, boolean field) {
        this.color = color;
        this.field = field;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isField() {
        return field;
    }

    public void setField(boolean field) {
        this.field = field;
    }

    public String getType() {
        return "Фигура";
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    @Override
    public String toString() {
        return "Это " + getType();
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean field, double radius) {
        super(color, field);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Окружность";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean field, double width, double height) {
        super(color, field);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean field, double side) {
        super(color, field, side, side);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }
}
