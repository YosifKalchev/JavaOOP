package dataBase;

import java.util.ArrayList;
import java.util.List;

public class TapesTakenRepository {

    public static User tapeTakerUser;

    public static void setTapeTakerUser(User tapeTakerUser) {
        TapesTakenRepository.tapeTakerUser = tapeTakerUser;
    }

    private static final TapesTakenRepository instance = new TapesTakenRepository();

    public static TapesTakenRepository getInstance() {
        return instance;
    }

    private final List<Tape> tapesTaken;

    private TapesTakenRepository() {

        tapesTaken = new ArrayList<>();
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

    public void addToTakenTapes(Tape tape) {
        tapesTaken.add(tape);
    }

    public void returnTape(Tape tape) {
        tape.setTaken(false);
        for (int i = 0; i < tapesTaken.size(); i++) {
            if (tapesTaken.get(i).getTapeTaker().equals(tapeTakerUser)) {
                if (tapesTaken.get(i).equals(tape)) {
                    tapesTaken.remove(tapesTaken.get(i));
                }
        } else {
                print("You cannot return a book which is taken by another customer." +
                        "Return a book that you have taken.");
                returnTape(tape);
            }
        }
    }

    public Tape getTapeByName(String name) {
        for (int i = 0; i < tapesTaken.size(); i++) {
            if (tapesTaken.get(i).getName().equals(name)) {
                return tapesTaken.get(i);
            }
        }
        return null;
    }
}
