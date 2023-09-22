package LabWork4;

public class Task4 {
    public static void main(String[] args) {
        ComputerBrand computerBrand1 = ComputerBrand.ASUS;
        ComputerBrand computerBrand2 = ComputerBrand.LENOVO;

        Processor processor1 = new Processor(2.4);
        Processor processor2 = new Processor(3.2);

        Memory memory1 = new Memory(500);
        Memory memory2 = new Memory(750);

        Monitor monitor1 = new Monitor(14.1);
        Monitor monitor2 = new Monitor(15.6);

        Computer computer1 = new Computer(computerBrand1, processor1, memory1, monitor1);
        Computer computer2 = new Computer(computerBrand2, processor2, memory2, monitor2);

        System.out.println(computer1);
        System.out.println(computer2);
    }
}

enum ComputerBrand {
    LENOVO("Lenovo"),
    ASUS("Asus");

    private String name;

    ComputerBrand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Processor {
    private double clockSpeedGHz;

    public Processor(double clockSpeedGHz) {

        this.clockSpeedGHz = clockSpeedGHz;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }
}

class Memory {
    private int capacityGB;

    public Memory(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    public int getCapacityGB() {
        return capacityGB;
    }
}

class Monitor {
    private double screenSizeInches;

    public Monitor(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }
}

class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand=" + brand.getName() +
                ", processor=" + processor.getClockSpeedGHz() +
                ", memory=" + memory.getCapacityGB() +
                ", monitor=" + monitor.getScreenSizeInches() +
                '}';
    }
}