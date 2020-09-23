package dataBase;

import dataBase.User;

public class Tape {

    private final String name;
    private boolean isTaken;
    public String tapeTaker;


    public Tape(String name) {
        this.name = name;
        isTaken = false;
        this.tapeTaker = UserRepository.getInstance().getUserByUsername("admin").toString();
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

    public String getTapeTaker() {
        return tapeTaker;
    }

    public void setTapeTaker(User tapeTaker) {
        this.tapeTaker = UserRepository.getInstance().getUsername(tapeTaker);
    }
}
