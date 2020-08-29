package dataBase;

import java.util.ArrayList;
import java.util.List;

public class TapesTakenRepository {

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
            print("Tape: " + tapesTaken.get(i).getName());
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
            if (tapesTaken.get(i).equals(tape)) {
                tapesTaken.remove(tapesTaken.get(i));
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
