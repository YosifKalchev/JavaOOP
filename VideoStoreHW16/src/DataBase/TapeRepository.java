package dataBase;

import java.util.ArrayList;
import java.util.List;

public class TapeRepository {

    public static User tapeTakerUser;

    private static final TapeRepository instance = new TapeRepository();

    public static TapeRepository getInstance() {
        return instance;
    }

    private final List<Tape> tapes;

    private TapeRepository() {
        tapes = new ArrayList<>();
        tapes.add(new Tape("Monk"));
        tapes.add(new Tape("Rambo"));
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
            System.out.print("The list of all tapes:\n");
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
        for (int i = 0; i < tapes.size(); i++) {
            if (tapes.get(i).equals(tape)) {
                tapes.remove(tapes.get(i));
            }
        }
        tape.setIsTaken(true);
    }

    public void returnTape (Tape tape) {
        tapes.add(tape);
    }

    public void addTape (Tape tape) {
        tapes.add(tape);
    }

    public void removeTape (Tape tape) {
        tapes.remove(tape);
    }

    private void print(String text) {
        System.out.println(text);
    }
}
