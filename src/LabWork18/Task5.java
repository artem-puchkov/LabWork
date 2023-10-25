package LabWork18;

import java.util.Objects;

public class Task5 {
    private static class Custom {
        Integer key;

        public Integer getDetails() {
            return key;
        }
    }

    public static void main(String[] args) {
        Custom custom = new Custom();

        try {
            if (Objects.isNull(custom.getDetails())) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Program is over");
        }
    }
}
