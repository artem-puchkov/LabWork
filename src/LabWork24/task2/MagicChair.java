package LabWork24.task2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Magic!");
    }

    @Override
    public String getChairType() {
        return "Magic";
    }
}
