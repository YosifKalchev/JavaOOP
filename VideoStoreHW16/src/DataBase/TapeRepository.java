package dataBase;

import java.util.ArrayList;
import java.util.List;

public class TapeRepository {

    private static final TapeRepository instance = new TapeRepository();

    public static TapeRepository getInstance() {
        return instance;
    }

    private final List<Tape> tapes;

    private TapeRepository() {
        tapes = new ArrayList<>();
        tapes.add(new Tape("The terminator"));
        tapes.add(new Tape("Agent 007"));
        tapes.add(new Tape("Troy"));
    }




    public Tape getTapeByName(String name) {
        for (int i = 0; i < tapes.size(); i++) {
            if (tapes.get(i).getName().equals(name)) {
                return tapes.get(i);
            }
        }
        return null;
    }

    public void showAllTapes() {
            print("The list of all tapes:\n");
        for (int i = 0; i < tapes.size(); i++) {
            print("Tape: " + tapes.get(i).getName() + "  is taken: " +
                    tapes.get(i).getIsTaken());
        }
    }

    public void showAllAvailableTapes() {
        print("The list of all available tapes:\n");
        for (int i = 0; i < tapes.size(); i++) {
            print("Tape: " + tapes.get(i).getName());
        }
        print("");
    }

    public void takeTape(Tape tape) {
        tape.setTaken(true);
        for (int i = 0; i < tapes.size(); i++) {
            if (tapes.get(i).equals(tape)) {
                tapes.remove(tapes.get(i));
            }
        }
    }

    public void returnTape (Tape tape) {
        tapes.add(tape);
    }
    private void print(String text) {
        System.out.println(text);
    }
}
