package dataBase;

import dataBase.User;

public class Tape {

    private final String name;
    private boolean isTaken;

    public Tape(String name) {
        this.name = name;
        isTaken = false;
    }

    public boolean getIsTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public String getName() {
        return name;
    }

}
