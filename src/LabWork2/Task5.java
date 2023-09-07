package LabWork2;

public class Task5 {
    public static void main(String[] args) {
        DogKennel dogKennel = new DogKennel(3);

        dogKennel.addDog("Шарик", 6);
        dogKennel.addDog("Бобик", 3);

        dogKennel.printDogKennelInfo();

        dogKennel.getHumanAge(0);
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class DogKennel {
    private Dog[] dogs;
    private int count;

    public DogKennel(int capacity) {
        dogs = new Dog[capacity];
        count = 0;
    }

    public void getHumanAge(int number){
        System.out.println(dogs[number].getHumanAge());
    }

    public void addDog(String name, int age) {
        if (count < dogs.length) {
            dogs[count] = new Dog(name, age);
            count++;
        } else {
            System.out.println("Питомник полон, больше нельзя добавить собак");
        }
    }

    public void printDogKennelInfo() {
        if (count == 0) {
            System.out.println("Питомник пуст");
        } else {
            System.out.println("Список собак в питомнике: ");
            for (int i = 0; i < count; i++) {
                System.out.println(dogs[i].toString());
            }
        }
    }
}