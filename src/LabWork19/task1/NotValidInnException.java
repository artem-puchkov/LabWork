package LabWork19.task1;

import java.math.BigInteger;

public class NotValidInnException extends RuntimeException {

    private final String innNum;

    public NotValidInnException(String inn) {
        super("INN " + inn + " is not valid, please try again.");
        innNum = inn;
    }

    public String getInnNum() {
        return innNum;
    }
}
