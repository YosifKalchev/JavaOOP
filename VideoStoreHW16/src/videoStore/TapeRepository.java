package videoStore;

import dataBase.Admin;
import dataBase.Customer;

import java.util.ArrayList;
import java.util.List;

public class TapeRepository {

    private static final TapeRepository instance = new TapeRepository();

    private static final TapeRepository taken = new TapeRepository();

    public static TapeRepository getInstance() {
        return instance;
    }

    public static TapeRepository getTapesTaken() {
        return taken;
    }

    private final List<Tape> tapes;
    private final List<Tape> tapesTaken;

    private TapeRepository() {

        tapes = new ArrayList<>();
        tapes.add(new Tape("The terminator"));
        tapes.add(new Tape("Agent 007"));
        tapes.add(new Tape("Troy"));
        tapesTaken = new ArrayList<>();
        tapesTaken.add(new Tape("Taken"));
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
            print("Tape: " + tapes.get(i).getName());
        }
        for (int y = 0; y < tapesTaken.size(); y++) {
            print("Tape: " + tapesTaken.get(y).getName());
        }
            print("");
    }

    public void showAllAvailableTapes() {
        print("The list of all available tapes:\n");
        for (int i = 0; i < tapes.size(); i++) {
            print("Tape: " + tapes.get(i).getName());
        }
        print("");
    }

    public void takeTape(Tape tape) {
        tapesTaken.add(tape);

    }

    private void print(String text) {
        System.out.println(text);
    }
}
