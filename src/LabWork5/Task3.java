package LabWork5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task3 extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> new Task3());
    }

    private final Shape[] shapes;

    public Task3() {
        setTitle("Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            if (i % 2 == 0) {
                shapes[i] = new Circle();
            } else {
                shapes[i] = new Rectangle();
            }
        }
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape() {
        Random random = new Random();
        color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        x = random.nextInt(50, 500); //координаты
        y = random.nextInt(50, 500);
    }

    abstract void draw(Graphics g);
}

class Circle extends Shape {
    private final int radius;

    public Circle() {
        super();
        Random random = new Random();
        radius = random.nextInt(10, 50);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle() {
        super();
        Random random = new Random();
        width = random.nextInt(20, 100);
        height = random.nextInt(20, 100);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

