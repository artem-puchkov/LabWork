package LabWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Input input = new ConsoleInput();

        while (true) {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Выйти");

            System.out.println("Выберите действие: ");
            int choice = input.getInt();

            if (choice == 1) {
                System.out.println("Введите бренд компьютера");
                String brand = input.getString();
                System.out.println("Введите цену компьютера");
                double price = input.getInt();

                Computer computer = new Computer(brand, price);
                shop.addComputer(computer);
                System.out.println("Компьютер добавлен в магазин.");
            } else if (choice == 2) {
                System.out.println("Введите бренд компьютера");
                String brand = input.getString();

                Computer computer = shop.findComputer(brand);
                if (computer != null) {
                    shop.removeComputer(computer);
                    System.out.println("Компьютер удален из магазина.");
                } else {
                    System.out.println("Компьютер не найден в магазине.");
                }
            } else if (choice == 3) {
                System.out.println("Введите бренд компьютера");
                String brand = input.getString();

                Computer computer = shop.findComputer(brand);
                if (computer != null) {
                    System.out.println("Найден компьютер: " + computer.toString());
                } else {
                    System.out.println("Компьютер не найден в магазине.");
                }
            } else if (choice == 4) {
                System.out.println("Выход из программы.");
                break;
            } else {
                System.out.println("Недопустимый выбор. Попробуйте еще раз.");
            }
        }
    }
}

class Computer {
    private String brand;
    private double price;

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand)) {
                return computer;
            }
        }
        return null;
    }
}

interface Input{
    String getString();
    int getInt();
}

class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return Integer.parseInt(scanner.nextLine());
    }
}