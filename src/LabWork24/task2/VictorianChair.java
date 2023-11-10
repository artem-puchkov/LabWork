package LabWork24.task2;

public class VictorianChair implements Chair {
    int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getChairType() {
        return "Victorian";
    }
}
