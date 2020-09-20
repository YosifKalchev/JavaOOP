package dataBase;

import java.util.ArrayList;
import java.util.List;

public class TapesTakenRepository {



    public User tapeTakerUser;

    private static final TapesTakenRepository instance = new TapesTakenRepository();

    public static TapesTakenRepository getInstance() {
        return instance;
    }

    private final List<Tape> tapesTaken;

    private TapesTakenRepository() {

        tapesTaken = new ArrayList<>();
    }

    public Tape getTapeByName(String name) {
        for (int i = 0; i < tapesTaken.size(); i++) {
            if (tapesTaken.get(i).getName().equals(name)) {
                return tapesTaken.get(i);
            }
        }
        return null;
    }

    public void showAllTapesTaken() {
        print("The list of all tapes taken:\n");
        for (int i = 0; i < tapesTaken.size(); i++) {
            print("Tape: " + tapesTaken.get(i).getName()  +
                    "  . Taken by: " + tapesTaken.get(i).getTapeTaker().getUsername());
        }
    }

    private void print(String text) {
        System.out.println(text);
    }

    public void setTapeTakerUser(User tapeTakerUser) {
        this.tapeTakerUser = tapeTakerUser;
    }

//todo tape.isTaken check!!!!
    public void returnTape(Tape tape) {
        for (int i = 0; i < tapesTaken.size(); i++) {
            if (tapesTaken.get(i).getTapeTaker().equals(CurrentUser.getLoggedUser())) {
                if (tapesTaken.get(i).isTaken() && tapesTaken.get(i).equals(tape)) {
                    tapesTaken.remove(tapesTaken.get(i));
                    tape.setIsTaken(false);
                }
            } else {
                print("You cannot return a book which is taken by another customer." +
                        "Return a book that you have taken.");
            }
        }
    }

    public void addTape (Tape tape) {
        tapesTaken.add(tape);
//        tape.setTapeTaker(CurrentUser.getLoggedUser());
    }

    public void removeTape (Tape tape) {
        tapesTaken.remove(tape);
    }
}
