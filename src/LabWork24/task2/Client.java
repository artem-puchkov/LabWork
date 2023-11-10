package LabWork24.task2;

public class Client {
    Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Client sit on " + chair.getChairType() + " chair");
    }
}
