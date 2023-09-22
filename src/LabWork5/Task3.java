package LabWork5;

public class Task3 {
    public static void main(String[] args) {
        Person person1 = new Person("Алексей", 21);
        Person person2 = new Person();

        person1.move();
        person1.talk();
    }
}

class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " возрастом " + age + " идет");
    }

    public void talk(){
        System.out.println(fullName + " возрастом " + age + " говорит");
    }
}
