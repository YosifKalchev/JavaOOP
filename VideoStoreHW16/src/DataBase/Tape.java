package dataBase;

import dataBase.User;

public class Tape {

    private final String name;
    private boolean isTaken;
    public User tapeTaker;

    public Tape(String name) {
        this.name = name;
        isTaken = false;
        this.tapeTaker = null;
    }

    public boolean getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(boolean taken) {
        isTaken = taken;
    }

    public String getName() {
        return name;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public User getTapeTaker() {
        return tapeTaker;
    }

    public void setTapeTaker(User tapeTaker) {
        this.tapeTaker = tapeTaker;
    }
}
