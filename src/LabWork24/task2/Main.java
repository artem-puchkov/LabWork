package LabWork24.task2;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();

        Chair chair1 = chairFactory.createFunctionalChair();
        Chair chair2 = chairFactory.createMagicChair();
        Chair chair3 = chairFactory.createVictorianChair(116);

        Client client = new Client();
        client.setChair(chair1);
        client.sit();

        client.setChair(chair2);
        client.sit();

        client.setChair(chair3);
        client.sit();
    }
}
