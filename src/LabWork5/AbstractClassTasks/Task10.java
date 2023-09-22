package LabWork5.AbstractClassTasks;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>() {{
            add(new Car("Car", 4, 300));
            add(new Airplane("Airplane", 30, 450));
            add(new Train("Train", 40, 350));
            add(new Ship("Ship", 35, 500));
        }};

        for(Vehicle vehicle: vehicles){
            System.out.println("Стоимость и время для пассажиров:");
            vehicle.calculatePassengerTransportCostAndTime(10);
            System.out.println("Стоимость и время для груза:");
            vehicle.calculateCargoTransportCostAndTime(10);
            System.out.println("");
        }
    }
}

abstract class Vehicle {
    private String name;
    private int passengersNumber;
    private int cargoNumber;

    public Vehicle(String name, int passengerCapacity, int cargoCapacity) {
        this.name = name;
        this.passengersNumber = passengerCapacity;
        this.cargoNumber = cargoCapacity;
    }

    public String getName() {
        return name;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public double getCargoNumber() {
        return cargoNumber;
    }

    public abstract void calculatePassengerTransportCostAndTime(int distance);
    public abstract void calculateCargoTransportCostAndTime(int distance);
}

class Car extends Vehicle {
    public Car(String name, int passengersNumber, int cargoNumber) {
        super(name, passengersNumber, cargoNumber);
    }

    @Override
    public void calculatePassengerTransportCostAndTime(int distance) {
        System.out.println("Стоимость равна: " + (distance + getPassengersNumber()));
        System.out.println("Время равно: " + (distance + getPassengersNumber() + 10));
    }

    @Override
    public void calculateCargoTransportCostAndTime(int distance) {
        System.out.println("Стоимость равна: " + (distance + getCargoNumber()));
        System.out.println("Время равно: " + (distance + getCargoNumber() + 10));
    }
}

class Airplane extends Vehicle {
    public Airplane(String name, int passengersNumber, int cargoNumber) {
        super(name, passengersNumber, cargoNumber);
    }

    @Override
    public void calculatePassengerTransportCostAndTime(int distance) {
        System.out.println("Стоимость равна: " + (distance + getPassengersNumber()) * 3);
        System.out.println("Время равно: " + (distance + getPassengersNumber() + 45));
    }

    @Override
    public void calculateCargoTransportCostAndTime(int distance) {
        System.out.println("Стоимость равна: " + (distance + getCargoNumber()) * 3);
        System.out.println("Время равно: " + (distance + getCargoNumber() + 45));
    }
}

class Train extends Vehicle {
    public Train(String name, int passengersNumber, int cargoNumber) {
        super(name, passengersNumber, cargoNumber);
    }

    @Override
    public void calculatePassengerTransportCostAndTime(int distance) {
        System.out.println("Стоимость равна: " + (distance + getPassengersNumber()) * 2);
        System.out.println("Время равно: " + (distance + getPassengersNumber() + 30));
    }

    @Override
    public void calculateCargoTransportCostAndTime(int distance) {
        System.out.println("Стоимость равна: " + (distance + getCargoNumber()) * 2);
        System.out.println("Время равно: " + (distance + getCargoNumber() + 30));
    }
}

class Ship extends Vehicle {
    public Ship(String name, int passengersNumber, int cargoNumber) {
        super(name, passengersNumber, cargoNumber);
    }

    @Override
    public void calculatePassengerTransportCostAndTime(int distance) {
        System.out.println("Стоимость равна: " + (distance + getPassengersNumber()) * 2);
        System.out.println("Время равно: " + (distance + getPassengersNumber() + 35));
    }

    @Override
    public void calculateCargoTransportCostAndTime(int distance) {
        System.out.println("Стоимость равна: " + (distance + getCargoNumber()) * 2);
        System.out.println("Время равно: " + (distance + getCargoNumber() + 35));
    }
}